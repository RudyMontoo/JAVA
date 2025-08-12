package bitwiseoperator;

import java.util.Scanner;

public class XORATOBRANGE {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your range");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int XOR=0;
        for(int i=number1;i<=number2;i++){
            XOR=XOR^i;
            System.out.println(XOR);
        }
    }
}
