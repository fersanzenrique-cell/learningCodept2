package org.educa.services;

public class ThreadService extends Thread {
    String name;

    public ThreadService(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(name);
        }
    }
}
