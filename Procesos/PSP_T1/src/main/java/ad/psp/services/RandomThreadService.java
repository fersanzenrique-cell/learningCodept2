package ad.psp.services;

import java.util.Random;

public class RandomThreadService extends Thread {
    public RandomThreadService() {
    }

    public void run() {
        Random randomNum = new Random();
        System.out.println(randomNum.nextInt(101));

    }
}
