package ESEOOPS.Problem14;
import java.util.*;
public class buffer {
    int item;
    boolean isFull=false;
    synchronized void produce(int val)throws InterruptedException{
        while(isFull) {
            wait();
        }
            item=val;
            System.out.println("Produced item:"+item);
        isFull=true;
        notify();
    }
    synchronized void consume()throws InterruptedException{
        while(!isFull) {
            wait();
        }

        System.out.println("Consumd item:"+item);
        isFull=false;
        notify();
    }
}
