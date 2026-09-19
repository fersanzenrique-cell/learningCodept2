package org.educa;


import org.educa.services.Ejercicio3.FileService;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

public class Main {
    public static final String NEW_LINE = "\n";

    public static void main(String[] args) {
        /*
        Actividad 3
        Programa en Java que pide un texto por teclado y un nombre de fichero, y a continuación cree un fichero txt y le añade el
        texto. Por último, deberá mostrar el contenido del fichero.
         */
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
            StringBuilder textOut = new StringBuilder();
            File actualPath = new File("./");
            System.out.println(textOut.append("Ingresa el nombre del archivo que quieras crear: ")
                    .append(NEW_LINE)
                    .append("La ruta actual del archivo será: ")
                    .append(actualPath.getAbsolutePath()));
            textOut.delete(0,textOut.length());
            FileService fileService = new FileService(in.readLine());
            if (!fileService.fileInitializer().exists())
            {
                if (fileService.makeFile())
                {
                    System.out.println(textOut.append("Creaste un nuevo archivo.")
                            .append(NEW_LINE)
                            .append("Ingresa el texto que quieras poner en el archivo."));
                    textOut.delete(0,textOut.length());
                    while (in.readLine().equals("0"))
                    {
                       // fix
                    }
                }

                else {
                    System.out.println("El archivo no se pudo crear.");
                }

            }
            else {
                System.out.println("El archivo ya estaba creado");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
