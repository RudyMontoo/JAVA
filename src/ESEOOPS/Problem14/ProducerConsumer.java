package ESEOOPS.Problem14;

import java.util.Scanner;

public class ProducerConsumer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        buffer b=new buffer();
        Thread producer=new Thread(()->{
            try{
                for(int i=0;i<=5;i++) b.produce(i);
            }catch (InterruptedException e){

            }
        });
        Thread consumer = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++)
                    b.consume();
            } catch (InterruptedException e) {}
        });

        producer.start();
        consumer.start();
    }
}
