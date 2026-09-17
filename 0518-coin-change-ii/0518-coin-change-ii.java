class Solution {
    public int change(int amount, int[] coins) {
        // METHOD 1 RECURSION (TLE -> 14/31)
        // METHOD 2 MEMOIZATION 
        int n=coins.length;
        // int[][] dp=new int[n+1][amount+1];
        // for(int[] row:dp){
        //     Arrays.fill(row,-1);
        // }
        // return func(n-1, amount, coins, dp);


        // METHOD 3 TABULATION
        int[][] dp=new int[n][amount+1];

        for(int i=0;i<n;i++){
            dp[i][0]=1;
        }

        for(int j = 1; j <= amount; j++) {
        if(j % coins[0] == 0)
            dp[0][j] = 1;
    }

        for(int i=1;i<n;i++){
            for(int j=1;j<=amount;j++){
                int take=0;
                if(coins[i]<=j){
                    take=dp[i][j-coins[i]];
                }
                int notTake=dp[i-1][j];
                dp[i][j]=take+notTake;
            }
        }
         return dp[n-1][amount];
    }

    private static int func(int idx, int trg, int[] coins, int[][] dp){
        if(trg==0 )return 1;
        if(idx<0)return 0;
        if(idx==0){
            if(coins[idx]==trg)return 1;
        }

        if(dp[idx][trg]!=-1)return dp[idx][trg];
        int take=0;
        if(coins[idx]<=trg){
            take=func(idx, trg-coins[idx], coins,dp);
        }
        int notTake=func(idx-1, trg, coins,dp);

        return dp[idx][trg]=take+notTake;
    }
}