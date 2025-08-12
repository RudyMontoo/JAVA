package recursion;

import java.util.Scanner;

public class fibbonacci {
    static int fibo(int n){
//        // by recursion
//        if(n==0 || n==1)return n;
//
//        int ans=fibo(n-1)+fibo(n-2);
//
//
//        return ans;

        //BY GOLDEN RATIO
        return (int) Math.round(
                (Math.pow((1 + Math.sqrt(5)) / 2, n) - Math.pow((1 - Math.sqrt(5)) / 2, n)) / Math.sqrt(5)
        );


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
//        int sol=fibo(n);
//        System.out.println(sol);
        for(int a0=0;a0<n;a0++){
            System.out.println(fibo(a0));
        }
    }
}
