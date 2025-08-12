package MATHDSA;

import java.util.Scanner;

public class NEWTONRAPSHONSQRT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int num1 = input.nextInt();
       
        System.out.println(sqrt(num1));
        
    }
    static double sqrt(double num){
        double x=num;
        double root;
        while(true){
            root=0.5*(x+(num/x));
            
            if(Math.abs(root-x)<0.5){
                break;
            }
            x=root;
        }

        return root;
    }
}
