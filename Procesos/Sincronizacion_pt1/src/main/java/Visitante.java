import java.util.concurrent.Semaphore;

public class Visitante extends Thread {
    Semaphore mutex = null;
    Museo visita = null;

    public Visitante(Semaphore mutex, Museo visita)
    {
        this.mutex = mutex;
        this.visita = visita;
    }

    public void run()
    {
        try {
            mutex.acquire();
            System.out.println("Entrar al museo " + currentThread());
            System.out.println(visita.num);
            visita.num++;
            mutex.release();
            sleep(1000);
            mutex.acquire();
            visita.num--;
            System.out.println(visita.num);
            System.out.println("Salida al museo " + currentThread());
            mutex.release();
        } catch (InterruptedException e) {
            throw new RuntimeException();
        }
    }
}
