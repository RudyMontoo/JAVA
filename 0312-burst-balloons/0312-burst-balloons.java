class Solution {
    public int maxCoins(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n+2];
        arr[0]=1;
        for(int i=0;i<nums.length;i++){
            arr[i+1]=nums[i];
        }
        arr[n+1]=1;
        int[][] dp=new int[n+2][n+2];
        for(int[] row: dp){
            Arrays.fill(row,-1);
        }
        return func(1,n,arr,dp);
    }

    public int func(int i, int j, int[] arr, int[][]dp){
        int n=arr.length-1;
        if(i>j)return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        
                int max=Integer.MIN_VALUE;
                for(int k=i;k<=j;k++){
                    int step=arr[i-1]*arr[k]*arr[j+1] + func(i,k-1,arr,dp)+func(k+1,j,arr,dp);
                    max=Math.max(step,max);
                }

            
        return dp[i][j]=max;
    }
}