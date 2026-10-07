import java.util.ArrayList;
import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        // Ejercicio 1
        /*
        Semaphore mutex = new Semaphore(1);
        Contador c = new Contador();
        Hilo h1 = new Hilo(c, mutex);
        Hilo h2 = new Hilo(c, mutex);
        h1.start();
        h2.start();

        try {
            h1.join();
            h2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            System.out.println("Fin de programa");
        }
         */
        // Ejercicio 2
        Semaphore mutex = new Semaphore(3);
        Semaphore entrada = new Semaphore(1);
        Museo museo = new Museo();
        DatosMuseo datosMuseo = new DatosMuseo();
        Visitante[] visitantes = new Visitante[4];
        long totalMilisegundos = 0;
        for (int i = 0; i < visitantes.length; i++) {
            visitantes[i] = new Visitante(mutex, entrada, museo, datosMuseo);
        }
        for (Visitante v : visitantes) {
            v.start();
        }
        try {
            for (Visitante v : visitantes)
            {
                v.join();
                totalMilisegundos += v.datosMuseo.tiempoVisita;
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            totalMilisegundos /= visitantes.length;
            System.out.printf("La media de milisegundos es: %d \n", totalMilisegundos);
            System.out.println("Fin del programa");
        }
    }
}
