package bitwiseoperator;

import java.util.Scanner;

public class evenoddchecking {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if((n&1)==1){
            System.out.println("odd");
        }
        else{
            System.out.println("even");
        }
    }
}
