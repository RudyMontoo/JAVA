package leetcode;

import java.util.*;

public class Feb6 {

    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 9, 10};
        int k = 3;

        System.out.println(minRemoval(nums, k));
    }

    public static int minRemoval(int[] nums, int k) {
        int n = nums.length;
        if (n <= 1) return 0;

        Arrays.sort(nums);

        int left = 0;
        int maxWindow = 1;

        for (int right = 0; right < n; right++) {
            while ((long) nums[right] > (long) nums[left] * k) {
                left++;
            }
            maxWindow = Math.max(maxWindow, right - left + 1);
        }

        return n - maxWindow;
    }
}
