import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class Actividad1
{
    public static void main(String[] args) {
        try (BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in)))
        {
            System.out.println("Pon la ruta relativa de lo que quieras listar:\n->./");
            String ruta = String.valueOf(teclado.readLine());
            File directorio = new File("./" + ruta);
            File[] lista = directorio.listFiles();
            if (lista != null)
            {
                for (File archivo : lista)
                {
                    System.out.printf("-> " + archivo + "\s");
                    if (archivo.isDirectory())
                    {
                        System.out.printf("es un directorio.\n");
                    }
                    else if (archivo.isFile())
                    {
                        System.out.printf("es un archivo.\n");
                    }
                }
            }
        } catch (RuntimeException | IOException e) {
            throw new RuntimeException(e);
        }
    }
}
