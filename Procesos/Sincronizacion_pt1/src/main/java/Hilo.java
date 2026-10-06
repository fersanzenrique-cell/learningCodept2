import java.util.concurrent.Semaphore;

public class Hilo extends Thread {
    Semaphore mutex = null;
    Contador c = null;
    public Hilo(Contador c, Semaphore mutex) {
        this.mutex = mutex;
        this.c = c;
    }
    public void run()
    {
        try {
            mutex.acquire();
            System.out.println("Antes " + c.num + " " + currentThread());
            c.num++;
            System.out.println("Después " + c.num + " " + currentThread());
            mutex.release();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
        }
    }
}
