// // METHOD 1 -> "MEMOIZATION"
// class Solution {

//     public int maxProfit(int[] prices, int fee) {

//         int[][] dp = new int[prices.length][2];

        
//         for (int i = 0; i < prices.length; i++) {
//             dp[i][0] = -1;
//             dp[i][1] = -1;
//         }

//         return func(0, true, prices, dp,fee);
//     }

//     public int func(int idx, boolean buy, int[] prices, int[][] dp, int fee) {

//         if (idx == prices.length)
//             return 0;

        
//         int state = buy ? 1 : 0;

      
//         if (dp[idx][state] != -1)
//             return dp[idx][state];

//         int profit;

//         if (buy) {

//             int take = -prices[idx]
//                     + func(idx + 1, false, prices, dp,fee);

//             int nottake = func(idx + 1, true, prices, dp,fee);

//             profit = Math.max(take, nottake);

//         } else {

//             int sell = prices[idx]-fee+
//                     + func(idx + 1, true, prices, dp,fee);

//             int notsell = func(idx + 1, false, prices, dp,fee);

//             profit = Math.max(sell, notsell);
//         }

//         // Store answer
//         dp[idx][state] = profit;

//         return profit;

//     }
// }
// METHOD 4 OPTIMIZATION 
class Solution {
    public int maxProfit(int[] prices, int fee) {
        int n=prices.length;
        int ahead0 = 0, ahead1 = 0;
        for (int idx = n - 1; idx >= 0; idx--) {
          int cur1 = Math.max(-prices[idx] + ahead0, ahead1);
          int cur0 = Math.max( prices[idx]-fee + ahead1, ahead0);
          ahead0 = cur0; ahead1 = cur1;
}
return ahead1;   // O(1) space
    }
}