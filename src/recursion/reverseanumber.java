package recursion;

import java.util.Scanner;

public class reverseanumber {
    static int reverse(int n,int m){
        if(n%10==n)return n;
        int rem=n%10;
        return rem*(int)Math.pow(10,m-1)+reverse(n/10,m-1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int totaldigit=(int)(Math.log10(n)+1);
        int result=reverse(n,totaldigit);
        System.out.println(result);

        //you can also that the number is palindrome or not
        if(n==result){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
