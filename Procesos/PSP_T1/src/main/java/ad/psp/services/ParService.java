package ad.psp.services;

public class ParService extends Thread {
    public ParService() {
    }

    public void run() {
        for (int i = 0; i <= 100; i += 2) {
            System.out.println(i);
        }
    }
}
