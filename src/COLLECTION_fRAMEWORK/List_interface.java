package COLLECTION_fRAMEWORK;

import java.util.ArrayList;
import java.util.Stack;

public class List_interface {
    static void arrayList(){
        ArrayList<Integer> list=new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(1));
        list.set(1,4);
        System.out.println(list);

        //linkedlist also work similar

    }
    static void stackList(){
        Stack<String> stack=new Stack<>();
        stack.add("r");
        stack.add("u");
        stack.add("d");
        System.out.println(stack);
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack);
        stack.search("r");

    }
    public static void main(String[] args) {
//        arrayList();
        stackList();
    }
}
