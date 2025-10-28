package Threading;
// 1st way t1.stop() ---> unsafe way beacuse jhn pr stop hoga to file ko aise hi
//chodega

// 2nd way--> safe way--> using flag
public class ThreadStopping extends Thread {
    public volatile boolean running =true;



    public void run(){
        for(int i=0;i<10&&running;i++){
            System.out.println("Running thread : "+i);
            try{
                Thread.sleep(500);
            } catch(InterruptedException e){
                System.out.println("Interrupted");
                return;
            }
        }
        System.out.println("Thread stopped safely");
    }

    public void stopThread(){
        running =false;
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadStopping t1 = new ThreadStopping();
        t1.start();
        Thread.sleep(4000); // main will sleep for 4 sec

        t1.stopThread();
    }
}
