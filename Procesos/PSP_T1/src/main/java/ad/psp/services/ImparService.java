package ad.psp.services;

public class ImparService extends Thread {
    public ImparService() {
    }

    public void run() {
        for (int i = 1; i <= 100; i += 2) {
            System.out.println(i);
        }
    }
}
