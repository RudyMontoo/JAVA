import java.util.*;

class Solution {
    boolean isSort(List<Integer> v) {
        int n = v.size();
        for (int i = 0; i < n; i++) {
            if (v.get(i) != i) {          // v2[i] was just i
                return false;
            }
        }
        return true;
    }

    public int minOperations(int[] nums) {
        int n = nums.length;
        List<Integer> v = new ArrayList<>();
        List<Integer> v2 = new ArrayList<>();

        int kt = -1;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                kt = i;
                break;
            }
        }

        for (int i = kt; i < n; i++) v.add(nums[i]);
        for (int i = 0; i < kt; i++) v.add(nums[i]);

        for (int i = kt; i >= 0; i--) v2.add(nums[i]);
        for (int i = n - 1; i > kt; i--) v2.add(nums[i]);

        int knt = Math.min(n - kt, kt + 2);
        int snt = Math.min(kt, n + 2 - kt);

        boolean a = isSort(v);
        boolean b = isSort(v2);

        if (a && b) return Math.min(snt, knt);
        if (a) return snt;
        if (b) return knt;
        return -1;
    }
}