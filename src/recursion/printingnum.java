package recursion;

import java.util.Scanner;

public class printingnum {
    static void printingnum(int n){
        if(n==0) return;
        printingnum(n-1);
        System.out.println(n);
//        printingnum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printingnum(n);
    }
}
