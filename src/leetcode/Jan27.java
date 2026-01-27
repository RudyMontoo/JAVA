package leetcode;
//https://leetcode.com/problems/maximum-substrings-with-distinct-start/?envType=problem-list-v2&envId=hash-table
import java.util.HashSet;

public class Jan27 {

    public static void main(String[] args) {
        Solution sol = new Solution();

        String s1 = "abcabc";
        String s2 = "aaaa";
        String s3 = "leetcode";

        System.out.println(sol.maxDistinct(s1)); // 3
        System.out.println(sol.maxDistinct(s2)); // 1
        System.out.println(sol.maxDistinct(s3)); // 6
    }
}

class Solution {
    public int maxDistinct(String s) {
        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }

        return set.size();
    }
}
