package ExsynchronizedThread;

public class SyResource {
    private int counter = 0;

    public synchronized void increment() {
        counter++;
        System.out.println(Thread.currentThread().getName() + " incremented counter to: " + counter);
        try {
            Thread.sleep(200); 
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }
    }

    public int getCounter() {
        return counter;
    }
}
