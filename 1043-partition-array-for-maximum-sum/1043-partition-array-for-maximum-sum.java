// class Solution {
//     public int maxSumAfterPartitioning(int[] arr, int k) {
//         // method 1 recursion
//         int n=arr.length;
//         if(n==1)return arr[0];
//         int[] dp=new int[n];
//         // method 2 memoization
//         Arrays.fill(dp,-1);
//         return func(0,arr,k,dp);
//     }
//     public int func(int idx, int[] arr, int k, int[] dp){
//         // base case
//         if(idx==arr.length)return 0;
//         if(dp[idx]!=-1)return dp[idx];
//         int max=Integer.MIN_VALUE;
//         int high=Integer.MIN_VALUE;
        
//         for(int j=idx;j<idx+k && j<arr.length;j++){
//             max=Math.max(max,arr[j]);
//             int sum=max*(j-idx+1) + func(j+1,arr,k,dp);
//             high=Math.max(high,sum);
//         }
//         return dp[idx]=high;
//     }

// }


// METHOD 3 TABULATION 
class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        
        int n=arr.length;
        if(n==1)return arr[0];
        int[] dp=new int[n+1];
        
        for(int i=n-1;i>=0;i--){
        int high=Integer.MIN_VALUE;
         int max=Integer.MIN_VALUE;
        for(int j=i;j<=Math.min(i+k-1, n-1);j++){
            max=Math.max(max,arr[j]);
            int sum=max*(j-i+1) + dp[j+1];
            high=Math.max(high,sum);
        }
        dp[i]=high;
        }
        return dp[0];
    }
}