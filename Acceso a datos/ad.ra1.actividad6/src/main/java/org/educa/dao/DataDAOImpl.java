package org.educa.dao;


import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class DataDAOImpl implements DataDAO {
    private static final String NEWLINE = "\n";
    private static final String SEPARATOR = ";";

    @Override
    public List<String> readDirectory(File dir) {
        List<String> dirList = new LinkedList<String>();
        try (BufferedReader dirReader = new BufferedReader(new FileReader(dir))) {
            StringBuilder line = new StringBuilder();
            String permission;
            for (File file : Objects.requireNonNull(dir.listFiles())) {
                permission = "[";
                permission += file.canExecute() ? "X" : "";
                permission += file.canRead() ? "R" : "";
                permission += file.canWrite() ? "W" : "";
                permission += "]";
                line.append(file.getName()).
                        append(SEPARATOR).
                        append(file.isDirectory() ? "D" : "F").
                        append(SEPARATOR).
                        append(permission).
                        append(SEPARATOR).
                        append(file.length())
                        .append(NEWLINE);
                dirList.add(String.valueOf(line));
                line.delete(0, line.length());
            }
            return dirList;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void writeData(List<String> data, File file) {
        StringBuilder lineBuilder = new StringBuilder();
        try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter(file))) {
            for (String line : data) {
                lineBuilder.append(line).append(NEWLINE);
                fileWriter.write(String.valueOf(lineBuilder));
                lineBuilder.delete(0, lineBuilder.length());
            }
            fileWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
