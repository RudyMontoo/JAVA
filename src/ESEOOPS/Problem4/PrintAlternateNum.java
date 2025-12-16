package ESEOOPS.Problem4;

public class PrintAlternateNum  {
    static class Printer{
     private int num=1;
     private final int max=10;
     synchronized void printOdd() {
         while (num <= max) {
             if (num % 2 == 0) {
                 try {
                     wait();
                 } catch (InterruptedException e) {
                     throw new RuntimeException(e);
                 }
             }
             System.out.println("ODD" + num++);
             notify();
         }
     }

         synchronized void printEven() {
             while (num <= max) {
                 if (num % 2 != 0) {
                     try {
                         wait();
                     } catch (InterruptedException e) {
                         throw new RuntimeException(e);
                     }
                 }
                 System.out.println("Even" + num++);
                 notify();
             }
         }

    }
    public static void main(String[] args){
        Printer p=new Printer();
        Thread t1=new Thread(p::printOdd);
        Thread t2=new Thread(p::printEven);
        t1.start();
        t2.start();
    }
}
