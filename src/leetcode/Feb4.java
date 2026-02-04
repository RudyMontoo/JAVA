package leetcode;

import java.util.*;

public class Feb4 {

    public static List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> result = new ArrayList<>();
        int n = l.length;

        for (int i = 0; i < n; i++) {
            int[] sub = Arrays.copyOfRange(nums, l[i], r[i] + 1);
            result.add(isArithmetic(sub));
        }
        return result;
    }

    private static boolean isArithmetic(int[] arr) {
        Arrays.sort(arr);
        int diff = arr[1] - arr[0];

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] != diff) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] nums = {4, 6, 5, 9, 3, 7};
        int[] l = {0, 0, 2};
        int[] r = {2, 3, 5};

        System.out.println(checkArithmeticSubarrays(nums, l, r));
    }

}
