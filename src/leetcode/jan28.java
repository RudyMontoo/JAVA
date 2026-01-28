package leetcode;

import java.util.HashSet;
import java.util.Arrays;

public class jan28 {

    public static int[] findIntersectionValues(int[] nums1, int[] nums2) {

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        int[] ans = new int[2];

        // add nums1 elements to set1
        for (int i = 0; i < nums1.length; i++) {
            set1.add(nums1[i]);
        }

        // add nums2 elements to set2
        for (int i = 0; i < nums2.length; i++) {
            set2.add(nums2[i]);
        }

        // count nums1 elements present in nums2
        for (int i = 0; i < nums1.length; i++) {
            if (set2.contains(nums1[i])) {
                ans[0]++;
            }
        }

        // count nums2 elements present in nums1
        for (int i = 0; i < nums2.length; i++) {
            if (set1.contains(nums2[i])) {
                ans[1]++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] nums1 = {4, 3, 2, 3, 1};
        int[] nums2 = {2, 2, 5, 2, 3, 6};

        int[] result = findIntersectionValues(nums1, nums2);

        System.out.println(Arrays.toString(result));
    }
}
