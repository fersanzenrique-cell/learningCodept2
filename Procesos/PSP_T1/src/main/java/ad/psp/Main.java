package ad.psp;

import ad.psp.services.FormulaService;
import ad.psp.services.ImparService;
import ad.psp.services.ParService;
import ad.psp.services.RandomThreadService;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        /* A) Realizar un programa java que simule una carrera de Fórmula 1 en el circuito de Mónaco:
        - Cada coche estará representado por un hilo, que estarán definidos con una única clase que recibirá el nombre del piloto en su constructor.
        - Los coches deben escribir por pantalla todas las vueltas de la 1 hasta 78.
        • Correrán los pilotos: Hamilton, Vettel, Raikkonen, Alonso, Sainz Jr, Bottas y Vandoome.
         */
        String[] listaPilotos = {"Hamilton", "Vettel", "Raikkonen", "Alonso", "Sainz Jr", "Bottas", "Vandoome"};
        ArrayList<FormulaService> threadList = new ArrayList<>();

        for (String listaPiloto : listaPilotos) {
            threadList.add(new FormulaService(listaPiloto));
        }

        for (FormulaService piloto : threadList) {
            piloto.start();
        }

        /*
        B) Realizar un programa java que cree 2 hilos, uno que saque por pantalla los números pares del 1 al 100 y otro los impares.
         */

        ParService par = new ParService();
        ImparService impar = new ImparService();

        par.start();
        impar.start();
        /*
        C) Realizar un programa java que cree 100 hilos, y cada uno escriba por pantalla un número distinto del 1 al 100.
         */
        ArrayList<RandomThreadService> randomList = new ArrayList<>(100);

        for (int i = 0; i <= 100; i++) {
            randomList.add(new RandomThreadService());
        }

        for (RandomThreadService random : randomList) {
            random.start();
        }

    }
}
