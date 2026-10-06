class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        // method 1 recursion
        int n=arr.length;
        if(n==1)return arr[0];
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        return func(0,arr,k,dp);
    }
    public int func(int idx, int[] arr, int k, int[] dp){
        // base case
        if(idx==arr.length)return 0;
        if(dp[idx]!=-1)return dp[idx];
        int max=Integer.MIN_VALUE;
        int high=Integer.MIN_VALUE;
        
        for(int j=idx;j<idx+k && j<arr.length;j++){
            max=Math.max(max,arr[j]);
            int sum=max*(j-idx+1) + func(j+1,arr,k,dp);
            high=Math.max(high,sum);
        }
        return dp[idx]=high;
    }

}