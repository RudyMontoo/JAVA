class Solution {
    public int rob(int[] nums) {
        // firstly do with recursion
        int n=nums.length;
        // Arrays.fill(flag,0);
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return func(n-1,nums,dp);
        
        
    }
    // METHOD 1  MEMORIZATION-> 67/70
    public int func(int idx,int[]nums, int[] dp){
        if(idx==0)return nums[idx];
        if(idx<0)return 0;
        if(dp[idx]!=-1)return dp[idx];
        int pick=nums[idx]+func(idx-2,nums,dp);
        int notpick=0+func(idx-1,nums,dp);
        dp[idx]=Math.max(pick, notpick);
        return dp[idx];
    }

    // 
}