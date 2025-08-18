package COLLECTION_fRAMEWORK;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

public class queueinterface {
    static void queueExample(){
        Queue<Integer> q=new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.peek());
    }
    static void dequeueExample(){
        Deque<Integer> q=new ArrayDeque<>();
        q.addFirst(1);
        q.addFirst(2);
        q.addLast(3);
        System.out.println(q);
        System.out.println(q.removeFirst());
        System.out.println(q.peek());
    }
    static void prioritydequeExample(){
        PriorityQueue<Integer> q=new PriorityQueue<>(); //minpq
        q.add(10);
        q.add(5);
        q.add(7);
        System.out.println(q.peek());
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println();
        //max priority queue
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder()); //minpq
        pq.add(10);
        pq.add(5);
        pq.add(7);
        System.out.println(pq.peek());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.peek());
    }
    public static void main(String[] args) {
//queueExample();
//        dequeueExample();
        prioritydequeExample();
    }
}
