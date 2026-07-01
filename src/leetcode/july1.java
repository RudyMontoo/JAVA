package leetcode;

import java.util.*;

public class july1 {
    public int maximumLength(int[] nums) {
        Map<Long, Integer> freq = new HashMap<>();
        for (int x : nums) {
            freq.merge((long) x, 1, Integer::sum);
        }

        int ans = 1;

        // Special case: 1*1 = 1, so chain can't grow via squaring; just use odd count of 1's
        int ones = freq.getOrDefault(1L, 0);
        if (ones > 0) {
            ans = Math.max(ans, ones % 2 == 1 ? ones : ones - 1);
        }

        // General case: chains x, x^2, x^4, ... (mountain shape, each level used twice except peak)
        for (long start : freq.keySet()) {
            if (start == 1L) continue;

            long cur = start;
            int len = 0;
            while (freq.getOrDefault(cur, 0) >= 2) {
                len += 2;
                cur *= cur;
            }
            len += freq.containsKey(cur) ? 1 : -1;

            ans = Math.max(ans, len);
        }

        return ans;
    }

    public static void main(String[] args) {
        july1 sol = new july1();
        System.out.println(sol.maximumLength(new int[]{1, 3, 2, 4}));    // sample test
        System.out.println(sol.maximumLength(new int[]{1, 1, 1, 1, 1})); // sample test
    }
}