import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

public class Actividad2
{
    public static void main(String[] args)
    {
        /*
        Cómo en el ejercicio anterior, todo está en el try
         */
        try (BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in)))
        {
            System.out.println("Pon la ruta relativa de lo que quieras renombrar o limpiar de etiquetas:\n->./");
            String ruta = String.valueOf(teclado.readLine());
            File directorio = new File("./" + ruta);
            File[] lista = directorio.listFiles();
            /* Hasta aquí la misma filosofía */
            if (lista != null)
            {
                for (File archivo : lista)
                {
                    String nuevoNombre = archivo.getAbsolutePath();
                    /*
                     - ¿Por qué queremos la ruta absoluta?
                     - Porque para luego poder manejar el renombrado (que se trata de crear otro archivo)
                     tenemos que saber donde estaba en primer lugar, si solo trabajamos con el nombre del archivo
                     la localización de este se pierde.
                     */
                    for (int i = 0; i < 5; i++) {
                        if (archivo.getAbsolutePath().substring(archivo.getAbsolutePath().length() - i).contains("_"))
                        {
                            nuevoNombre = archivo.getAbsolutePath().substring(0, (archivo.getAbsolutePath().length() - i));
                        }
                    }
                    /*
                    - ¿Qué hace este bucle for?
                    - Lo que hace es mirar el nombre del archivo o carpeta desde atrás, sí "i" contiene "_"
                    el nombre del archivo desde el index, hacia adelante es borrado.
                    El programa si ve que ya está escrito cualquier cosa que acabe con _ este borra lo que haya adelante.
                    Es utíl para no acabar viendo ficheros con "..._RWX_RWX_RWX".
                    Cada paso que da el bucle es el siguiente: X -> WX -> RWX -> _RWX.
                    Por eso utilizé contains() en vez equals().
                     */
                    archivo.renameTo(new File(nuevoNombre));
                    // No tengo que usar el boolean que devuelve renameTo() en este caso
                    nuevoNombre += "_";
                    if (archivo.canRead())
                    {
                        nuevoNombre += "R";
                    }
                    if (archivo.canWrite())
                    {
                        nuevoNombre += "W";
                    }
                    if (archivo.canExecute())
                    {
                        nuevoNombre += "X";
                    }
                    /*
                    Cadena de if, ya que todos los casos pueden ser ciertos
                     */
                    archivo.renameTo(new File(nuevoNombre));
                }
            }
            else
            {
                System.out.println("Ruta no encontrada");
            }
        } catch (Exception e)
        {
            throw new RuntimeException(e);
        }
    }
}
