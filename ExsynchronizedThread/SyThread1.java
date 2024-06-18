package ExsynchronizedThread;

public class SyThread1 extends Thread {
    private final SyResource resource;

    public SyThread1(SyResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            resource.increment();
        }
    }
}
