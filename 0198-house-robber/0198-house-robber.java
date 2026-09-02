class Solution {
        // METHOD 1  MEMORIZATION-
    // public int rob(int[] nums) {
    //     // firstly do with recursion
    //     int n=nums.length;
    //     // Arrays.fill(flag,0);
    //     int[] dp=new int[n+1];
    //     Arrays.fill(dp,-1);
    //     return func(n-1,nums,dp);
        
        
    // }

    // public int func(int idx,int[]nums, int[] dp){
    //     if(idx==0)return nums[idx];
    //     if(idx<0)return 0;
    //     if(dp[idx]!=-1)return dp[idx];
    //     int pick=nums[idx]+func(idx-2,nums,dp);
    //     int notpick=0+func(idx-1,nums,dp);
    //     dp[idx]=Math.max(pick, notpick);
    //     return dp[idx];
    // }


    // method 2 tabulation
    // public int rob(int[] nums) {
    //      int n=nums.length;
    //     // Arrays.fill(flag,0);
    //     int[] dp=new int[n+1];
    //     Arrays.fill(dp,-1);
    //     dp[0]=nums[0];
    //     int neg=0;
    //     for(int i=1;i<n;i++){
    //         int pick=nums[i];
    //         if(i>1)pick+=dp[i-2];
    //         int notpick=0+dp[i-1];
    //         dp[i]=Math.max(pick, notpick);
    //     }
    //     return dp[n-1];
    // }

    // method 3 tabulation with space optimization
    public int rob(int[] nums) {
              int n=nums.length;
        // Arrays.fill(flag,0);
       
        int prev1=nums[0];
        int prev2=0;
       
        for(int i=1;i<n;i++){
            int pick=nums[i];
            if(i>1)pick+=prev2;
            int notpick=0+prev1;
            int curr=Math.max(pick, notpick);
            prev2=prev1;
            prev1=curr;
            
        }
        return prev1;
    }

}