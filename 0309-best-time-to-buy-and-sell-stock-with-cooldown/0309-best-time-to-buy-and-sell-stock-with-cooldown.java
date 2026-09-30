// METHOD 1 -> "MEMOIZATION"
class Solution {

    public int maxProfit(int[] prices) {

        int[][] dp = new int[prices.length+2][2];

        
        for (int i = 0; i < prices.length; i++) {
            dp[i][0] = -1;
            dp[i][1] = -1;
        }

        return func(0, true, prices, dp);
    }

    public int func(int idx, boolean buy, int[] prices, int[][] dp) {

        if (idx == prices.length)
            return 0;

        
        int state = buy ? 1 : 0;

      
        if (dp[idx][state] != -1)
            return dp[idx][state];

        int profit;

        if (buy) {

            int take = -prices[idx]
                    + func(idx + 1, false, prices, dp);

            int nottake = func(idx + 1, true, prices, dp);

            profit = Math.max(take, nottake);

        } else {

            int sell = prices[idx]
                    + func(idx + 2, true, prices, dp);

            int notsell = func(idx + 1, false, prices, dp);

            profit = Math.max(sell, notsell);
        }

        // Store answer
        dp[idx][state] = profit;

        return profit;

    }
}