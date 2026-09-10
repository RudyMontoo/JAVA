class Solution {
    int ans=0;
    public int minimumTotal(List<List<Integer>> triangle) {
        // METHOD 1 RECURSION
       
        // return func(0,0,triangle); //  27/46

        // METHOD 2 MEMOIZATION
        int n=triangle.size();
        
        int[][] dp=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=Integer.MIN_VALUE;
            }
        }
        return func(0,0,triangle,dp);

        // 
    }

    public int func(int i, int j, List<List<Integer>> triangle, int[][] dp){
        // base condition
        int n=triangle.size();
        if(i==n-1)return triangle.get(n-1).get(j);
        if(i>=n || j>=n)return 0;
        if(dp[i][j]!=Integer.MIN_VALUE)return dp[i][j];
        // int d
        int d=triangle.get(i).get(j)+func(i+1,j,triangle,dp);
        // int adj
        int a=triangle.get(i).get(j)+func(i+1,j+1,triangle,dp);
        

        dp[i][j]=Math.min(d,a);
        return dp[i][j];
    }
}