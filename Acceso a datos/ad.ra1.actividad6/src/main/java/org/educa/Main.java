package org.educa;

import org.educa.entity.FileEntity;
import org.educa.services.FileService;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        FileService fileService = new FileService();
        FileEntity fileEntity = new FileEntity();

        System.out.println("Selecciona directorio: ");

        try (Scanner in = new Scanner(System.in)) {
            fileEntity.setDataList(fileService.chooseDirectory(new File(in.nextLine())));
            System.out.println("Introduce fichero donde escribir: ");
            fileService.writeInFile(fileEntity, new File(in.nextLine()));
        }
    }
}
