// // METHOD 1 -> MEMOIZATION 

// class Solution {

//     public int maxProfit(int k,int[] prices){

//         int[][][] dp = new int[prices.length][2][k+1];

       
//         for (int i = 0; i < prices.length; i++){
//             for(int j=0;j<=k;j++){
//             dp[i][0][j] = -1;
//             dp[i][1][j] = -1;
//             }
            
//         }

//         return func(0, true, prices, dp,k);
//     }

//     public int func(int idx, boolean buy, int[] prices, int[][][] dp, int k) {

//         if (idx == prices.length)
//             return 0;
        
//         if(k==0)return 0;
        
//         int state = buy ? 1 : 0;

        
//         if (dp[idx][state][k] != -1)
//             return dp[idx][state][k];

//         int profit;

//         if (buy) {

//             int take = -prices[idx]
//                     + func(idx + 1, false, prices, dp,k);

//             int nottake = func(idx + 1, true, prices, dp,k);

//             profit = Math.max(take, nottake);

//         } else {

//             int sell = prices[idx]
//                     + func(idx + 1, true, prices, dp,k-1);

//             int notsell = func(idx + 1, false, prices, dp, k);

//             profit = Math.max(sell, notsell);
//         }

       
//         dp[idx][state][k] = profit;

//         return profit;
//     }
// }


// METHOD 2 -> TABULATION
class Solution {

    public int maxProfit(int k,int[] prices){

        int[][][] dp = new int[prices.length+1][2][k+1];
        for(int idx=prices.length-1;idx>=0;idx--){
            for(int buy=0;buy<=1;buy++){
                for(int cap=1;cap<=k;cap++){
                    int profit;
                    if (buy==1) {

                    int take = -prices[idx]
                            + dp[idx + 1][0][cap];

                    int nottake = dp[idx + 1][1][cap];

                    profit = Math.max(take, nottake);

                } else {

                    int sell = prices[idx]
                            + dp[idx + 1][1][cap-1];

                    int notsell = dp[idx + 1][0][cap];

                    profit = Math.max(sell, notsell);
        }
                dp[idx][buy][cap]=profit;
      
                }
            }
        }
         return dp[0][1][k];
    }
}