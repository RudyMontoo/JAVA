package sorting;

import java.util.Scanner;

public class cyclicsort {
    static void Cyclic(int[] arr, int n) {
        int i = 0;
        while (i < n) {
            int correct = arr[i] - 1;
            // Only swap if the current element is not at its correct position
            if (arr[i] != arr[correct]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else {
                i++;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("CYCLIC SORTING");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array before sorting");
        for (int i = 0; i < n; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println();

        Cyclic(arr, n);

        System.out.println("Array after sorting");
        for (int i = 0; i < n; i++) {
            System.out.print(" " + arr[i]);
        }
    }
}