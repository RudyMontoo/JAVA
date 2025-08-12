package recursion;

import java.util.Scanner;

public class bubblesortbyrecursion {
    static void bubblesort(int[] arr, int row, int col) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            if (arr[col] > arr[col + 1]) {
                int temp = arr[col];
                arr[col] = arr[col + 1];
                arr[col + 1] = temp;
            }
            bubblesort(arr, row, col + 1);
        } else {
            bubblesort(arr, row - 1, 0);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }

        bubblesort(num, n - 1, 0);
        for (int i = 0; i < n; i++) {
            System.out.println(num[i]);
        }
    }
}