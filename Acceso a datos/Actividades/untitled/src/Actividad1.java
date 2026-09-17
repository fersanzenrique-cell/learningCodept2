import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class Actividad1
{
    public static void main(String[] args) {
        /*
        Ponemos todo nuestro código en un try con recursos pillando las excepciones
        que pueden saltar del BufferedReader y cerrándolo automáticamente.
         */
        try (BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in)))
        {
            /*
            Preguntamos al usuario que ruta quiere poner, he puesto un "./" antes para hacer saber
            que es la carpeta de este proyecto
             */
            System.out.println("Pon la ruta relativa de lo que quieras listar:\n->./");
            String ruta = String.valueOf(teclado.readLine());
            File directorio = new File("./" + ruta);
            File[] lista = directorio.listFiles();
            /*
            Antes de comprobar nada, tendríamos que saber si la lista existe.
             */
            if (lista != null)
            {
                for (File archivo : lista)
                {
                    System.out.printf("-> " + archivo + "\s");
                    /*
                    Un if y else if, ya que aunque archivo no sea un directorio, no lo convierte en un archivo.
                     */
                    if (archivo.isDirectory())
                    {
                        System.out.print("es un directorio.\n");
                    }
                    else if (archivo.isFile())
                    {
                        System.out.print("es un archivo.\n");
                    }
                }
            }
            else
            {
                System.out.println("El directorio " + directorio.getAbsolutePath() + " no existe");
            }
        }
        catch (RuntimeException | IOException e)
        {
            throw new RuntimeException(e);
        }
    }
}
