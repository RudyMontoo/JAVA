package rudra;

import java.util.Scanner;

public class Code17pythogoreantriplet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number1");
        int n1=sc.nextInt();
        System.out.println("enter the number2");
        int n2=sc.nextInt();
        System.out.println("enter the number3");
        int n3=sc.nextInt();
        System.out.println("Let check the given number is pythogoreantriplet or not");
        pytgortrp(n1,n2,n3);

    }
    static void pytgortrp(int n1, int n2, int n3){
        int num1sq=n1*n1;
        int num2sq=n2*n2;
        int sum=num1sq+num2sq;
        int num3sq=n3*n3;
        if(sum==num3sq){
            System.out.println("Your number is a pythogoreantriplet");
        }
        else{
            System.out.println("Your number is not a pythogoreantriplet");
        }
    }
}
