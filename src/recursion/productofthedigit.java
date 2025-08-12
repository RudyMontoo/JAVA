package recursion;

import java.util.Scanner;

public class productofthedigit {
    static int product(int n){
        if(n==0)return 1;
        return n%10*product(n/10);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int result=product(n);
        System.out.println(result);
    }
}
