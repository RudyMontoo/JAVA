class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==0)return 0;
        if(n==1)return nums[0];
        // cond -> if i take ast element then cant explore first and vice versa
        int[] dp1=new int[n+1];
        int[] dp2=new int[n+1];
        Arrays.fill(dp1,-1);
        Arrays.fill(dp2,-1);
        return Math.max(func1(n-1,nums,dp1), func2(n-2,nums,dp2));
        
    }

  
     public int func1(int idx,int[]nums, int[] dp){
        if(idx==1)return nums[idx];
        if(idx<1)return 0;
       if(dp[idx]!=-1)return dp[idx];
        int pick=nums[idx]+func1(idx-2,nums,dp);
        int notpick=0+func1(idx-1,nums,dp);
        dp[idx]=Math.max(pick, notpick);
        return dp[idx];
        
    }
    public int func2(int idx,int[]nums, int[] dp){
        if(idx==0)return nums[idx];
        if(idx<0)return 0;
        if(dp[idx]!=-1)return dp[idx];
        int pick=nums[idx]+func2(idx-2,nums,dp);
        int notpick=0+func2(idx-1,nums,dp);
        dp[idx]=Math.max(pick, notpick);
        return dp[idx];
    }
}