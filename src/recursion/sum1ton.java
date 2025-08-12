package recursion;

import java.util.Scanner;

public class sum1ton {
    static int sum(int n){
        if(n==0)return 0;
        return n+sum(n-1);
    }
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int result=sum(n);
        System.out.println("The sum of "+n+" to 1 number:"+result);

    }
}
