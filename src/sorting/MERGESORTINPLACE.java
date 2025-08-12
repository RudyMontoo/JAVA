package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class MERGESORTINPLACE {
    static void mergesortInplace(int[] arr, int s, int e) {
        if (e - s == 1) {
            return;
        }
        int mid = s + (e - s) / 2;
        mergesortInplace(arr, s, mid);
        mergesortInplace(arr, mid, e);
        mergeInplace(arr, s, mid, e);
    }

    static void mergeInplace(int[] arr, int s, int m, int e) {
        int[] mix = new int[e - s];
        int i = s;
        int j = m;
        int k = 0;
        while (i < m && j < e) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i < m) {
            mix[k] = arr[i];
            i++;
            k++;
        }
        while (j < e) {
            mix[k] = arr[j];
            j++;
            k++;
        }
        for (int l = 0; l < mix.length; l++) {
            arr[s + l] = mix[l];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        mergesortInplace(arr, 0, n);
        System.out.println(Arrays.toString(arr));
    }
}