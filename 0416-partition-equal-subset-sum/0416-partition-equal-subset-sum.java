class Solution {
    public boolean canPartition(int[] nums) {
        int total_sum=0;
        for(var x: nums){
            total_sum+=x;
        }
        if(total_sum%2!=0)return false;
        
        int[][] dp=new int[nums.length+1][(total_sum/2)+1];
        for(int[] row: dp){
            Arrays.fill(row,-1);
        }
        return func(nums.length-1,total_sum/2,nums,dp);

        }

    // METHOD 2 MEMOIZATION
 public static boolean func(int idx, int k, int[] arr,int[][]dp){

        if(k==0)return true;

        if(idx==0)return (k==arr[0]);

        if(dp[idx][k]!=-1)return (dp[idx][k]==1);
        boolean take=false;
        if(arr[idx]<=k) {
            take = func(idx - 1, k - arr[idx], arr, dp);
        }
        boolean not_take=func(idx-1, k, arr,dp);
        boolean result=take||not_take;
        dp[idx][k]=result?1:0;
        return dp[idx][k]==1;
    }

}