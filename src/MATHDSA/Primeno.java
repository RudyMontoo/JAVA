package MATHDSA;

import java.util.Scanner;

public class Primeno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = input.nextInt();
        int c=2;
        int count=0;
        while(c*c<=number){
            if(number%c==0){
                count++;
            }
            c++;
        }
        if(count==0){
            System.out.println("Prime number");
        }
        else{
            System.out.println("Not Prime number");
        }
    }
}
