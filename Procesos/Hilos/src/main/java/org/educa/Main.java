package org.educa;

import org.educa.services.ThreadService;

public class Main {
    public static void main(String[] args) {
        ThreadService thread = new ThreadService("Pablo");
        thread.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Enrique");
        }
    }
}
