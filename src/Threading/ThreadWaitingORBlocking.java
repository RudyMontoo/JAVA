package Threading;
//waiting or blocking ka mtlb hota hai ki wo kissi IO ke liye wait kr rha hai just like OS

//method 1 use sleep in main
//method 2 is use join()
public class ThreadWaitingORBlocking extends Thread{
    public void run(){
        for(int i =0;i<5;i++){
            System.out.println("Thread "+i);
            try{
                Thread.sleep(500);
            } catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args)  throws InterruptedException{
        ThreadWaitingORBlocking t1 = new ThreadWaitingORBlocking();
        t1.start();
        t1.join();
        System.out.println("Now main will run after completeion of child threads");
    }
}
