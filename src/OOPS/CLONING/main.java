package OOPS.CLONING;

import java.util.Arrays;

public class main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human H1=new Human(34,"Rudra Sharma");
//        Human twin=new Human(H1);
Human twin=(Human)H1.clone();
        System.out.println(twin.name);
        System.out.println(Arrays.toString(twin.arr));
        twin.arr[0]=100;
//        shallow copy
       // System.out.println(Arrays.toString(H1.arr)); //100,5,9,6,1
//        deep copy
        System.out.println(Arrays.toString(twin.arr));//100,5,9,6,1
        System.out.println(Arrays.toString(H1.arr));//original one

    }
}
