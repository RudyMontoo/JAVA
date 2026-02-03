package leetcode;

public class Feb3 {

    public static boolean isTrionic(int[] nums) {
        int n = nums.length;
        if (n < 3) return false;

        int p = 0;

        // Phase 1: strictly increasing
        while (p + 1 < n && nums[p] < nums[p + 1]) {
            p++;
        }
        if (p == 0) return false;

        int q = p;

        // Phase 2: strictly decreasing
        while (q + 1 < n && nums[q] > nums[q + 1]) {
            q++;
        }
        if (p == q) return false;
        if (q == n - 1) return false;

        // Phase 3: strictly increasing
        for (int i = q; i + 1 < n; i++) {
            if (nums[i] >= nums[i + 1]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 4, 2, 6, 8};

        System.out.println(isTrionic(nums)); // true
    }
}
