// method 1 recursion
class Solution {
    public int lengthOfLIS(int[] nums){
        int n=nums.length;
        int[][] dp=new int[n][n+1];
        for(int[] row:dp){
        Arrays.fill(row,-1);
        }
        return func(0,-1,nums,dp);
    }
    public int func(int idx ,int prev,  int[] nums, int[][] dp){
        if(idx==nums.length)return 0;
        if(dp[idx][prev+1]!=-1)return dp[idx][prev+1];
        // take 
        int take=0;
        // int notTake=0;
        if(prev==-1 || nums[idx]>nums[prev]){
            take=1+func(idx+1,idx,nums,dp);
        }
        //not take
            int notTake=func(idx+1,prev,nums,dp);

        dp[idx][prev+1]=Math.max(take,notTake);
        
        return dp[idx][prev+1];
    }
}