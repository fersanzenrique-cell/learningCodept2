import java.util.concurrent.Semaphore;

public class Visitante extends Thread {
    Semaphore mutex = null;
    Semaphore entrada = null;
    Museo visita = null;
    DatosMuseo datosMuseo = null;
    public Visitante(Semaphore mutex, Semaphore entrada, Museo visita, DatosMuseo datosMuseo)
    {
        this.mutex = mutex;
        this.entrada = entrada;
        this.visita = visita;
        this.datosMuseo = datosMuseo;
    }

    public void run()
    {
        try {
            // Entrada al museo
            entrada.acquire();
            System.out.println("Entrar al museo " + currentThread());
            System.out.println(visita.num);
            visita.num++;
            entrada.release();
            long tiempo = (long) (((Math.random() * 10) + 1) * 1000);
            sleep(tiempo);
            System.out.println(tiempo);
            // Tiempo del museo
            mutex.acquire();
            if (mutex.availablePermits() == 0)
            {
                System.out.println(currentThread() + "es el ultimo aforo.");
            }
            datosMuseo.tiempoVisita = tiempo;
            mutex.release();
            // Salida del museo
            entrada.acquire();
            visita.num--;
            System.out.println(visita.num);
            System.out.println("Salida al museo " + currentThread());
            entrada.release();
        } catch (InterruptedException e) {
            throw new RuntimeException();
        }
    }
}
