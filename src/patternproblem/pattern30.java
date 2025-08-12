package patternproblem;

import java.util.Scanner;

public class pattern30 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        for(int row=1;row<=n;row++){

            for(int space=0;space<n-row;space++){
                System.out.print(" ");
            }
            for(int col=row;col>=1;col--){
                System.out.print(col);
            }
            for(int col=2;col<=row;col++){
                System.out.print(col);
            }
            System.out.println();
        }

    }
}
