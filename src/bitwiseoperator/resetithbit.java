package bitwiseoperator;

import java.util.Scanner;

public class resetithbit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=sc.nextInt();
        int j=n&(~(1<<(i-1)));
        System.out.println(j);

    }
}
