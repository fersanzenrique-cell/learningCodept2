#!/usr/bin/env bash
set -euo pipefail

# Claude hizo esto

# Ruta real del script (antes de cambiar de carpeta)
SCRIPT_PATH="$(readlink -f "$0")"
cd "$(dirname "$SCRIPT_PATH")"

PERFILES=(amp acceso procesos)

# --- Servicios con SSH: editar aquí al añadir más -------------------------
SSH_USER="dev"
SSH_HOST="127.0.0.1"
SSH_SERVICIOS=(acceso_datos procesos)
declare -A SSH_PERFIL=( [acceso_datos]=acceso [procesos]=procesos )
declare -A SSH_PUERTO=( [acceso_datos]=2222   [procesos]=2223 )
declare -A SSH_DIR=(    [acceso_datos]=/IdeaProjects [procesos]=/IdeaProjects )
# ---------------------------------------------------------------------------

uso() {
  cat <<EOF
Uso: $(basename "$0") <comando> [perfil] [servicio]

Comandos:
  up <perfil>                Levanta los contenedores del perfil (y muestra el acceso)
  down <perfil>              Los para y elimina (los volúmenes se conservan)
  stop <perfil>              Los para sin eliminarlos
  build <perfil>             Reconstruye las imágenes y levanta
  shell <perfil> <servicio>  Abre una terminal dentro de un servicio
  logs <perfil> [servicio]   Muestra los logs (Ctrl+C para salir)
  status                     Muestra los contenedores
  info [perfil]              Datos de acceso SSH / Gateway / base de datos
  alias [nombre]             Crea un alias en tu .bashrc/.zshrc (por defecto: dev)

Perfiles: ${PERFILES[*]}
EOF
  exit 1
}

validar_perfil() {
  local p="${1:-}"
  for x in "${PERFILES[@]}"; do [[ "$x" == "$p" ]] && return 0; done
  echo "Perfil no válido: '${p}'. Disponibles: ${PERFILES[*]}" >&2
  exit 1
}

# Usuario de Windows (para mostrar la ruta de la clave). Mejor esfuerzo.
usuario_windows() {
  (cd /mnt/c 2>/dev/null && cmd.exe /c "echo %USERNAME%" 2>/dev/null | tr -d '\r') || true
}

# Puerto real publicado (solo si el contenedor está en marcha)
puerto_real() {
  docker compose --profile "$1" port "$2" 22 2>/dev/null | awk -F: '{print $NF}' || true
}

info() {
  local filtro="${1:-}"
  local win_user; win_user="$(usuario_windows)"
  win_user="${win_user:-TU_USUARIO}"

  for svc in "${SSH_SERVICIOS[@]}"; do
    local perfil="${SSH_PERFIL[$svc]}"
    [[ -n "$filtro" && "$filtro" != "$perfil" ]] && continue

    local
