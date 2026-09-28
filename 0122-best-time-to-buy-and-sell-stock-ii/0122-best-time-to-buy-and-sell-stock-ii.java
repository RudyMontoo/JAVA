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



//         // METHOD 2 Recusion
//         int[][] dp=new int[proces.length+1][2];
//         return func(0, true, prices,dp);
//         // 1 allow to buy
//     }

//     public int func(int idx, boolean buy, int[] prices){
//         if(idx==prices.length)return 0;
        
//         if(dp[idx][buy]==-1)return dp[idx][buy];
//         int profit=Integer.MIN_VALUE;
//         if(buy){
//             int take=-prices[idx]+func(idx+1, false, prices);
//             int nottake=0+func(idx+1, true, prices);
//             profit=Math.max(take, nottake);
//         }
//         else{
//             int sell=prices[idx]+func(idx+1, true,prices);
//             int notsell=0+func(idx+1, false, prices);
//             profit=Math.max(sell, notsell);
//         }
//         return profit;
        
//     }
// }


class Solution {

    public int maxProfit(int[] prices) {

        int[][] dp = new int[prices.length][2];

        // -1 means "not calculated yet"
        for (int i = 0; i < prices.length; i++) {
            dp[i][0] = -1;
            dp[i][1] = -1;
        }

        return func(0, true, prices, dp);
    }

    public int func(int idx, boolean buy, int[] prices, int[][] dp) {

        if (idx == prices.length)
            return 0;

        // boolean → int
        int state = buy ? 1 : 0;

        // Already calculated
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
                    + func(idx + 1, true, prices, dp);

            int notsell = func(idx + 1, false, prices, dp);

            profit = Math.max(sell, notsell);
        }

        // Store answer
        dp[idx][state] = profit;

        return profit;
    }
}