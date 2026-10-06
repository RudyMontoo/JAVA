class Solution {
    public int minCost(int n, int[] cuts) {
        // int[][] dp=new int[n+1][n+1];// MEMORY LIMIT EXCEEDED
        int[] cut=new int[cuts.length+2];
        cut[0]=0;
        cut[cut.length-1]=n;
        for(int i=0;i<cuts.length;i++){
            cut[i+1]=cuts[i];
        }
        int[][] dp=new int[cut.length][cut.length];
    
        for(int[] row: dp){
            Arrays.fill(row,-1);
        }

        Arrays.sort(cut);
        return func(0,cut.length-1,cut,dp);
    }
    public int func(int i, int j, int[] cut, int[][] dp){
        if(i+1==j)return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        int min=Integer.MAX_VALUE;
        for(int k=i+1;k<j;k++){

                int cost=cut[j]-cut[i]+func(i,k,cut,dp)+func(k,j,cut,dp);
                min=Math.min(min,cost);
            
        }
        return dp[i][j]=min;
    }
}