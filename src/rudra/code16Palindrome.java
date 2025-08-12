package rudra;

import java.util.Scanner;

public class code16Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter your number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        palindrome(n);
    }
    static void palindrome(int n){
        int origin=n;
        int n1;
        int n2=0;
        while(n!=0){
            n1=n%10;
            n2=n2+n1;
            n2=n2*10;
            n=n/10;
        }
        if(origin==n2/10){
            System.out.println("Your number is a palindrome");
        }
        else{
            System.out.println("Your number is not a palindrome");
        }

    }
}
