[[Programas, ejecutables, procesos y servicios|]]
- Un **hilo** (o *thread*) es una secuencia de código en ejecución dentro de un [[Programas, ejecutables, procesos y servicios#^6e2b06|proceso]]. Un hilo no puede ejecutarse por sí mismo, necesita la supervisión de un proceso padre.
- Los hilos se emplean en programas que necesitan realizar varias tareas simultáneamente. Por ejemplo un procesador de texto puede tener un hilo que se encargue de imprimir un documento y otro que atienda las peticiones del usuario.
- Hay dos tipos de hilos:
	- **Hilos de Usuario** *(green thread)* son creados por algún programa que exigen constantes cambios de contexto. Son más ligeros y sencillos de programar que los de sistema.
	- **Hilos de sistema** son aquellos que crea el sistema operativo normalmente para realizar alguna tarea del *kernel* y no está asociada a ninguna tarea de usuario.
- En esta tabla veremos que recursos son compartidos entre hilos y cuáles no.

| Compartidos                      | No compartidos                                                                                     |
| -------------------------------- | -------------------------------------------------------------------------------------------------- |
| Código (instrucciones)           | Contador del programa (cada hilo puede ejecutar una sección distinta de código)                    |
| Variables globales               | Registros de CPU                                                                                   |
| Ficheros y dispositivos abiertos | Pila para las variables locales de los procedimientos a las que se invoca después de crear un hilo |
|                                  | Estado: distinos hilos pueden estar en ejecución, listos o bloqueados esperando un evento          |
