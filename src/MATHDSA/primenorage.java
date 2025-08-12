package MATHDSA;

import java.util.Scanner;

public class primenorage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        for(int i=num1;i<=num2;i++){
            int count=0;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==0){
                System.out.println(i);
            }

        }

    }
}
