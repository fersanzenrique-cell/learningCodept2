package org.educa;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        ProcessBuilder processBuilder = new ProcessBuilder();
        System.out.println(processBuilder.command("qterminal"));
        processBuilder.start();
    }
}
