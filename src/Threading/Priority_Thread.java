package Threading;

public class Priority_Thread extends Thread{
    public void run(){
        System.out.println("Thread Name : "+Thread.currentThread().getName()+" "+"Priority : "+Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        Priority_Thread t = new Priority_Thread();
        Priority_Thread t1 = new Priority_Thread();
        Priority_Thread t2 = new Priority_Thread();

        t1.setPriority(MAX_PRIORITY);
        t2.setPriority(MIN_PRIORITY);
        t.setPriority(NORM_PRIORITY);
        t.start();
        t1.start();
        t2.start();
    }
}
