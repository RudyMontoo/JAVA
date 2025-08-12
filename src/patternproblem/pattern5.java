package patternproblem;

import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        // MY SOLUTION
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//
//                System.out.printf("* ");
//            }
//            System.out.println();
//        }
//        for(int i=n-1;i>=0;i--){
//            for(int j=1;j<=i;j++){
//
//                System.out.printf("* ");
//            }
//            System.out.println();
//        }


        //SIR METHOD
        for(int row=0;row<2*n;row++){
            int totalcolinrows=row>n?2*n-row:row;
            for(int col=0;col<totalcolinrows;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
