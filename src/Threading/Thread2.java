package Threading;
//by implementing runnable interface
public class Thread2 implements Runnable {
//    Runnable is an functional interface i.e  one abstrat method run()
    public void run(){
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        Thread2 t = new Thread2();
        Thread t1=new Thread(t);
        t1.start();
    }
}
