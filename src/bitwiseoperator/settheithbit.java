package bitwiseoperator;

import java.util.Scanner;

public class settheithbit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=sc.nextInt();
        int j=n|(1<<(i-1));
        System.out.println(j);

        //checking
        if((n & (1 << (i - 1))) != 0){
            System.out.println("bit is set");
        }
        else{
            System.out.println("bit is NOT set");
        }
    }
}
