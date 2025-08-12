package recursion;

import java.util.Scanner;

public class selectionsortbyrecursion {
    static void selectionsort(int[] arr, int row, int col, int maxIndex) {
        if (row == 0) {
            return;
        }
        if (col <= row) {
            if (arr[col] > arr[maxIndex]) {
                maxIndex = col;
            }
            selectionsort(arr, row, col + 1, maxIndex);
        } else {
            // Swap the found maximum with the last element of the current pass
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[row];
            arr[row] = temp;
            // Next pass: one less element, start from 0
            selectionsort(arr, row - 1, 0, 0);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }

        selectionsort(num, n - 1, 0, 0);
        for (int i = 0; i < n; i++) {
            System.out.println(num[i]);
        }
    }
}