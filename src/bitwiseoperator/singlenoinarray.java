package bitwiseoperator;

import java.util.Scanner;

public class singlenoinarray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        int xor = 0;
        for (int num:arr) {
            xor ^= num;
        }
        System.out.println("XOR of all numbers: " + xor);
    }
}
