package org.educa.services.Ejercicio3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileService {
    private String title;
    private static final String LOCALPATH = "./";
    public FileService(String title) {
        this.title = title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public File fileInitializer()
    {
        StringBuilder completePath = new StringBuilder();
        return new File(String.valueOf(completePath.append(LOCALPATH).append(this.getTitle())));
    }

    public boolean makeFile() throws IOException {

        return fileInitializer().createNewFile();
    }

    public String fileWriter(String text) {
        File file = fileInitializer();
        if (file.exists())
        {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file)))
            {
                writer.append(text);
                writer.close();
                return text;
            }
            catch (IOException e)
            {
                return e.getMessage();
            }
        }
        else {
            StringBuilder error = new StringBuilder();
            return String.valueOf(error.append(text).append(" no existe."));
        }
    }
}
