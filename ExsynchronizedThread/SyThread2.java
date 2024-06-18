package ExsynchronizedThread;

public class SyThread2 extends Thread {
    private final SyResource resource;

    public SyThread2(SyResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            resource.increment();
        }
    }
}
