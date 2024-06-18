package ExsynchronizedThread;

public class Main {
    public static void main(String[] args) {
        SyResource resource = new SyResource();

        SyThread1 t1 = new SyThread1(resource);
        SyThread2 t2 = new SyThread2(resource);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Final counter value: " + resource.getCounter());
    }
}
