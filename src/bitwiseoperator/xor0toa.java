package bitwiseoperator;

import java.util.Scanner;

public class xor0toa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = input.nextInt();
        int XOR=0;
        for(int i=0;i<=number;i++){
            XOR=XOR^i;
            System.out.println(XOR);
        }
    }
}
