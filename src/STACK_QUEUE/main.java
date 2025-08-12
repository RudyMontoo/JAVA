package STACK_QUEUE;

public class main {
    public static void main(String[] args) throws StackException {
//        Custom_stack stack = new Custom_stack(5);
//        stack.push(10);
//        stack.push(20);
//        stack.push(30);
//        stack.push(40);
//        stack.push(50);
//        stack.pop();
//        stack.pop();
//        stack.pop();
//        stack.pop();
//        stack.pop();
//        stack.pop();



        DynamicStack stack = new DynamicStack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
       stack.push(60);
       stack.push(70);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}
