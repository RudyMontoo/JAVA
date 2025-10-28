package Threading;
public class Thread1 extends Thread {
    //By extending thread
    public void run(){
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        t1.start();
    }
}
