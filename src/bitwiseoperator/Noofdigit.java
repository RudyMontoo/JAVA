package bitwiseoperator;

import java.util.Scanner;

public class Noofdigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        System.out.println("Enter the base:");
        int base = input.nextInt();
        int digit=(int)(Math.log(number)/Math.log(base))+1;
        System.out.println("The digit is "+digit);
    }
}
