package patternproblem;

import java.util.Scanner;

public class pattern31 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int originaln=n;
        n=2*n;
        for(int row=0;row<=n;row++){
            for(int col=0;col<=n;col++){
                int element=originaln-Math.min(Math.min(row,col),Math.min(n-row,n-col));
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
