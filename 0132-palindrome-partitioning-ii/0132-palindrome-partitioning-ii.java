class Solution {
    public int minCut(String s) {
        int n = s.length();

        // Step 1: palindrome table
        boolean[][] isPal = new boolean[n][n];
        for (int i = n - 1; i >= 0; i--) {
            for (int j = i; j < n; j++) {
                if (s.charAt(i) == s.charAt(j) && (j - i < 3 || isPal[i + 1][j - 1])) {
                    isPal[i][j] = true;
                }
            }
        }

        // Step 2: memoized DP
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        return func(0, n, isPal, dp) - 1;   // pieces - 1 = cuts
    }

    public int func(int i, int n, boolean[][] isPal, int[] dp) {
        if (i == n) return 0;
        if (dp[i] != -1) return dp[i];

        int min = Integer.MAX_VALUE;
        for (int j = i; j < n; j++) {
            if (isPal[i][j]) {                         // O(1) check
                int cut = 1 + func(j + 1, n, isPal, dp);
                min = Math.min(min, cut);
            }
        }
        return dp[i] = min;
    }
}