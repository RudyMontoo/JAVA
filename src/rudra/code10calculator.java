package rudra;

import java.util.Scanner;

public class code10calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your two numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Enter your operator : ");
        char op=sc.next().charAt(0);
        int result=0;
        if(op=='+'){
            result=num1+num2;
        }
        else if(op=='-'){
            result=num1-num2;
        }
        else if(op=='*'){
            result=num1*num2;
        }
        else if(op=='/'){
            result=num1/num2;
        }
        else{
            System.out.println("Please give basic operator");
        }

        System.out.println(
                "The result is "+result
        );
    }
}
