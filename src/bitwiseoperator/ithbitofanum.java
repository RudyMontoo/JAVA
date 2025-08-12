package bitwiseoperator;

import java.util.Scanner;

public class ithbitofanum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i=input.nextInt();
        int j=n&(1<<(i-1));
        System.out.println(j);
    }
}
