package patternproblem;

import java.util.Scanner;

public class pattern28 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //METHOD 1

//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n - i; j++)
//                System.out.print(" ");
//            for (int j = 1; j <= (2 * i) - 1; j++)
//                System.out.print("*");
//            System.out.println();
//        }
//
//        // Lower half
//        for (int i = n - 1; i >= 1; i--) {
//            for (int j = 1; j <= n - i; j++)
//                System.out.print(" ");
//            for (int j = 1; j <= (2 * i) - 1; j++)
//                System.out.print("*");
//            System.out.println();
//        }
//


        //METHOD 2(SIR)

        for(int row=0;row<2*n;row++){
            int totalcolinrows=row>n?2*n-row:row;
            int totalspaceinrow=n-totalcolinrows;
            for(int space=0;space<totalspaceinrow;space++){
                System.out.print(" ");
            }
            for(int col=0;col<totalcolinrows;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
