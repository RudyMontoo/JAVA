package rudra;

import java.util.Scanner;

public class code8fibbonacci {
    public static void main(String[] args) {
        System.out.println("Enter the term : ");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;
        int c=0;
        for(int i=1;i<n;i++){
            c=a+b;
            a=b;
            b=c;
        }
        System.out.println("The fibonacci numbers at "+n+" is "+c+"");
    }
}
