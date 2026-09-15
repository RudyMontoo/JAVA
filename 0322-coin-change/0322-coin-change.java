class Solution {
    static final int INF = 1_000_000_000;
    public int coinChange(int[] coins, int amount) {
        if(amount==0)return 0;
        // METHOD 1 RECURSION-> (28/189)
        // return func(coins.length-1,amount,coins);


        // METHOD 2 MEMOIZATION
         int[][] dp=new int[coins.length+1][amount+1];
         for(int[] row: dp){
            Arrays.fill(row,-1);
         }
         int ans=func(coins.length-1,amount,coins,dp);
         return ans == INF ? -1 : ans;
    }

    public static int func(int idx,int amt, int[] coins, int[][] dp){
        if(amt==0){
            return 0;
        }
        if(idx==0){
            if(amt%coins[0]==0)return amt/coins[0];
            else return INF;
        }
       
        if(dp[idx][amt]!=-1)return dp[idx][amt];

        int take=Integer.MAX_VALUE;
        if(coins[idx]<=amt){
        take=1+func(idx,amt-coins[idx],coins,dp);
        }
        int notTake=0+func(idx-1,amt,coins,dp);
        
        return dp[idx][amt]=Math.min(take, notTake);

    }
}