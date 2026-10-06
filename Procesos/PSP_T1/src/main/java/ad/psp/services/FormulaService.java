package ad.psp.services;

public class FormulaService extends Thread {
    String pilot;

    public FormulaService(String pilot) {
        this.pilot = pilot;
    }

    public void run() {
        for (int i = 0; i < 78; i++) {
            System.out.println(pilot + " está en " + i);
        }
    }
}
