package recursion;

import java.util.Scanner;

public class factorialofnumber {
    static int fact(int n){
        if(n==0)return 1;
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int result=fact(n);
        System.out.println("The factorial of "+n+":"+result);

    }
}
