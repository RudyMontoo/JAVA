package ESEOOPS.Problem5;

public class Print1_5 {
    static class Demo extends Thread{
        public void run(){
            int num=1;
            while(num<=5){
                System.out.println(num++);
            }
        }
    }
    static class Demo2 implements Runnable{
        public void run(){
            int num=1;
            while(num<=5){
                System.out.println(num++);
            }
        }
    }
    public static void main(String[] args) {
Demo d=new Demo();
d.start();

Thread t1=new Thread(new Demo2());
t1.start();
    }
}
