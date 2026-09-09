class Solution {
    // SAME CODE AS PREVIOUS PROBLEM 62 ONLY ONE CONDITION TO ADD
    int ans=0;

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        
        int m=obstacleGrid.length;

        int n=obstacleGrid[0].length;

        if(m==1 && n==1){
            if(obstacleGrid[0][0]==0)return 1;
            else return 0; 
        }
        if(obstacleGrid[0][0]==1)return 0;
        // method 1 recursion 
        // func(m-1,n-1,obstacleGrid);
        // return ans;


        // Method 2 Memoization
        int[][] dp=new int[m+1][n+1];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        return func(m-1,n-1,obstacleGrid,dp);
    
    }

    // public void func(int i, int j, int[][] grid){
    //     if(i==0 && j==0){
    //         ans++;
    //         return;
    //     }
        
    //     if(i<0 || j<0)return;
    //     if(grid[i][j]==1)return;
    //     // up

    //     func(i-1,j,grid);

    //     //left
    //     func(i,j-1,grid);

    //     return;
    // } 


    //Method 2 Memoization
    public int func(int i, int j, int[][] grid, int[][] dp){
        if(i==0 && j==0){
            return 1;
        }
        
        if(i<0 || j<0)return 0;
        if(grid[i][j]==1)return 0;
       
        if(dp[i][j]!=-1)return dp[i][j];
        int up=func(i-1,j,grid,dp);
        int left=func(i,j-1,grid,dp);
        dp[i][j]=left+up;

        return dp[i][j];
    } 
}