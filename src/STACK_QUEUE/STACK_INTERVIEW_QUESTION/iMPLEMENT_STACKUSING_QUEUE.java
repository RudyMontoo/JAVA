package STACK_QUEUE.STACK_INTERVIEW_QUESTION;

import java.util.Stack;

public class iMPLEMENT_STACKUSING_QUEUE {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.pop());



    }
}
class Queueusingstack{
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public Queueusingstack(){
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }
    public void push(int x){
        stack1.push(x);
    }
    public int pop() throws Exception{
        if(stack1.isEmpty()){
            throw new Exception("Empty Stack");
        }

        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        int removed= stack2.pop();
        while(stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        return removed;
    }

    public void isEmpty() throws  Exception{
        if(stack1.isEmpty()){
           throw new Exception("Empty Stack");
        }
    }

    public int peek() throws Exception{
        if(stack1.isEmpty()){
            throw new Exception("Empty Stack");
        }
        return stack1.peek();
    }
}
