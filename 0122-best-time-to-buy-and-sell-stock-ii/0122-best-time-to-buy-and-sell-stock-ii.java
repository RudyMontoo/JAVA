// class Solution {
//     public int maxProfit(int[] prices) {
//         //METHOD 1 LINEAR WAY
//         // int buy=prices[0];
//         // int total=0;
//         // int maxpf=0;


//         // for(int i=1;i<prices.length;i++){
//         //     int pf=prices[i]-buy;
//         //     if(pf>=0){
//         //         total+=pf;
//         //         pf=0;
//         //         buy=prices[i];
//         //     }
//         //     else{
//         //         buy=prices[i];
//         //     }
//         // }
//         // return total;

// }
// }



// METHOD 2 -> MEMOIZATION 
// class Solution {

//     public int maxProfit(int[] prices) {

//         int[][] dp = new int[prices.length][2];

//         // -1 means "not calculated yet"
//         for (int i = 0; i < prices.length; i++) {
//             dp[i][0] = -1;
//             dp[i][1] = -1;
//         }

//         return func(0, true, prices, dp);
//     }

//     public int func(int idx, boolean buy, int[] prices, int[][] dp) {

//         if (idx == prices.length)
//             return 0;

//         // boolean → int
//         int state = buy ? 1 : 0;

//         // Already calculated
//         if (dp[idx][state] != -1)
//             return dp[idx][state];

//         int profit;

//         if (buy) {

//             int take = -prices[idx]
//                     + func(idx + 1, false, prices, dp);

//             int nottake = func(idx + 1, true, prices, dp);

//             profit = Math.max(take, nottake);

//         } else {

//             int sell = prices[idx]
//                     + func(idx + 1, true, prices, dp);

//             int notsell = func(idx + 1, false, prices, dp);

//             profit = Math.max(sell, notsell);
//         }

//         // Store answer
//         dp[idx][state] = profit;

//         return profit;
//     }
// }



// METHOD 3 TABULATIONS
class Solution {

    public int maxProfit(int[] prices) {
        int n=prices.length;
        int[][] dp = new int[prices.length+1][2];
        dp[n][0]=0;
        dp[n][1]=0;

        for(int idx=n-1;idx>=0;idx--){
            int profit=0;
            for(int buy=0;buy<=1;buy++){
                        if (buy==1) {

            profit = Math.max(-prices[idx]
                    + dp[idx+1][0], dp[idx+1][1]);

        } else {

            profit = Math.max(prices[idx]
                    + dp[idx+1][1], dp[idx+1][0]);
        }
                 dp[idx][buy] = profit;    
            }
             
        }

        return dp[0][1];
    }
}