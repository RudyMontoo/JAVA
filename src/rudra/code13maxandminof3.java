package rudra;

import java.util.Scanner;

public class code13maxandminof3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number : ");
        int num1=sc.nextInt();
        System.out.println("Enter the 2nd number : ");
        int num2=sc.nextInt();
        System.out.println("Enter the 3rd number : ");
        int num3=sc.nextInt();
        int maximum=max(num1,num2,num3);
        int minimum=min(num1,num2,num3);
        System.out.println(maximum+" "+minimum);

    }
    static int max(int a,int b,int c){
        if(a>b){
            if(a>c){
                return a;
            }
            else{
                return c;
            }
        }
        else{
            if(b>c){
                return b;
            }
            else{
                return c;
            }
        }
    }

    static int min(int a,int b,int c){
        if(a<b){
            if(a<c){
                return a;
            }
            else{
                return c;
            }
        }
        else{
            if(b<c){
                return b;
            }
            else{
                return c;
            }
        }
    }
}
