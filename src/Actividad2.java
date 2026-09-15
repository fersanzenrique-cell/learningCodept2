import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

public class Actividad2
{
    public static void main(String[] args)
    {
        try (BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in)))
        {
            System.out.println("Pon la ruta relativa de lo que quieras renombrar:\n->./");
            String ruta = String.valueOf(teclado.readLine());
            File directorio = new File("./" + ruta);
            System.out.println(directorio.canRead());
            File[] lista = directorio.listFiles();
            if (lista != null)
            {
                for (File archivo : lista)
                {
                    String nuevoNombre = archivo.getAbsolutePath();
                    System.out.println(archivo.canRead());
                    for (int i = 0; i < 4; i++) {
                        if (archivo.getAbsolutePath().substring(archivo.getAbsolutePath().length() - i).equals("_"))
                        {
                            nuevoNombre = archivo.getAbsolutePath().substring(0, (archivo.getAbsolutePath().length() - i));
                        }
                    }
                    archivo.renameTo(new File(nuevoNombre));
                    System.out.println(nuevoNombre);
                    nuevoNombre += "_";
                    // System.out.println(archivo.canRead());
                    System.out.println(archivo.exists());

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
                    archivo.renameTo(new File(nuevoNombre));
                    System.out.println(nuevoNombre);
                }
            }
        } catch (Exception e)
        {
            throw new RuntimeException(e);
        }
    }
}
