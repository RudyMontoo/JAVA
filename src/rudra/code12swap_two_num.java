package rudra;

import java.util.Scanner;

public class code12swap_two_num {
    static void swap(int a, int b){
        int c=a;
        a=b;
        b=c;
        System.out.println(a+" "+b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number : ");
        int num1=sc.nextInt();
        System.out.println("Enter the 2nd number : ");
        int num2=sc.nextInt();
        System.out.println("After swaping : ");
        swap(num1,num2);
    }



}
