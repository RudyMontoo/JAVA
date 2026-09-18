class Solution {
    public int longestPalindromeSubseq(String s) {
        int n=s.length();
        int[][] dp=new int[n+1][n+1];
        for(int[] row: dp){
            Arrays.fill(row,-1);
        }
        return func(0,n-1,s,dp);
    }

    public int func(int i, int j, String s, int[][] dp){
        if(i==j)return 1;
        if(i>j)return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        if(s.charAt(i)==s.charAt(j)){
            dp[i][j]=2+func(i+1,j-1,s,dp);
        }
        else dp[i][j]= Math.max(func(i+1,j,s,dp), func(i,j-1,s,dp));
        return dp[i][j];
    }
}