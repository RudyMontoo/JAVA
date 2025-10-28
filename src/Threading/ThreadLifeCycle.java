package Threading;

public class ThreadLifeCycle extends Thread {

    public void run() {
        System.out.println("RUNNING");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadLifeCycle t1 = new ThreadLifeCycle();

        // NEW state
        System.out.println("State after creation: " + t1.getState());

        // Start the thread (RUNNABLE)
        t1.start();
        System.out.println("State after start(): " + t1.getState());

        // Pause the main thread for a bit
        Thread.sleep(100);
        System.out.println("State after 100ms: " + t1.getState());

        // Wait for t1 to finish
        t1.join();
        System.out.println("State after join(): " + t1.getState());
    }
}

