class Solution {
    int ans=0;
    public int uniquePaths(int m, int n) {
        // METHOD 1 BY RECURSION   (39/64)
        // func(0,0,m,n);
        // return ans;

        // METHOD 2 BY MEMOIZATION (dynamic programming)
        int[][] dp=new int[m+1][n+1];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        return func(m-1,n-1,dp);

    }
    // METHOD 1 BY RECURSION   (39/64)
    // private void func(int i, int j, int m, int n){
    //     if(i==m-1 && j==n-1){ans++;
    //     return;
    //     }

    //     if(i>=m || j>=n){
    //         return;
    //     }

    //     // right
    //     func(i,j+1,m,n);

    //     // down
    //     func(i+1, j,m,n);


    //     return;
    // }




     // METHOD 2 BY MEMOIZATION (dynamic programming)
     private int func(int i, int j, int[][] dp){
        if(i==0 && j==0){
        return 1;
        }
        if(i<0 || j<0)return 0;
        if(dp[i][j]!=-1)return dp[i][j];

        int up=func(i-1,j,dp);
        int left=func(i,j-1,dp);
        dp[i][j]=left+up;
        
        return dp[i][j];
        
     }
}