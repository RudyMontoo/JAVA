package leetcode;

import java.util.*;

public class wordbreak {

    public static void main(String[] args) {
        String s = "catsanddog";
        List<String> wordDict = Arrays.asList("cat", "cats", "and", "sand", "dog");

        boolean result = wordBreak(s, wordDict);
        System.out.println(result);
    }

    public static boolean wordBreak(String s, List<String> wordDict) {
        Set<String> set = new HashSet<>(wordDict);
        Boolean[] dp = new Boolean[s.length()];
        return wb(s, set, 0, dp);
    }

    public static boolean wb(String s, Set<String> set, int start, Boolean[] dp) {
        if (start == s.length()) return true;

        if (dp[start] != null) return dp[start];

        for (int end = start; end < s.length(); end++) {
            String str1 = s.substring(start, end + 1);

            if (set.contains(str1) && wb(s, set, end + 1, dp)) {
                return dp[start] = true;
            }
        }

        return dp[start] = false;
    }
}