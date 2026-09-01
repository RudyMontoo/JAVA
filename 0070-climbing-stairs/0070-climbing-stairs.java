class Solution {
   
    public int climbStairs(int n) {
        // method 1 DO USING RECURSION 
      
        // return func(n);


        // method 2 DP(memorization)
        int[] dp=new int[n+1];
        // return func(n,dp);

        // method 3 DP(tabulation)
        dp[0]=1;
        dp[1]=1;

        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
     
       
    }
    // below method is fail because its increase by 2^n
    // public int func(int n){
    //     if(n==0){
    //         return 1;
    //     }
    //     if(n<0)return 0;
    //     return func(n-1)+func(n-2);
        
    // }


    // public int func(int n, int[] dp){
    //     if(n<0)return 0;
    //     if(n==0)return 1;
    //     if(dp[n]!=0)return dp[n];
    //     dp[n]=func(n-1,dp)+func(n-2,dp);
    //     return dp[n];
    // }

}