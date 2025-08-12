package recursion;

import java.util.Scanner;

public class patternprintingbyrecusion {
    //triangle1
//    static void pattern(int row,int col){
//        if(row==0){
//            return;
//        }
//       if(col<row){
//           System.out.print("*");
//
//           pattern(row,col+1);
//       }
//       else{
//
//           System.out.println();
//           pattern(row-1,0);
//       }
//    }

    //triangle2
    static void pattern(int row,int col){
        if(row==0){
            return;
        }
        if(col<row){
            pattern(row,col+1);
            System.out.print("*");


        }
        else{


            pattern(row-1,0);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        pattern(n,0);
    }
}
