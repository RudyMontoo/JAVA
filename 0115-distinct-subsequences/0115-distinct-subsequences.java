class Solution {
    // METHOD 1 MEMOIZATION
    // public int numDistinct(String s, String t) {
    //     int n1=s.length();
    //     int n2=t.length();
    //     int[][] dp=new int[n1+1][n2+1];
    //     for(int[] row: dp){
    //         Arrays.fill(row,-1);
    //     }
    //     return func(n1-1,n2-1,s,t,dp);
    // }

    // public int func(int i,int j,  String s, String t, int[][] dp){
    //     if(j<0)return 1;
    //     if(i<0)return 0;
    //     if(dp[i][j]!=-1)return dp[i][j];
    //     if(s.charAt(i)==t.charAt(j)){
    //         dp[i][j]=func(i-1, j-1,s,t,dp)+ func(i-1, j,s,t,dp);
    //     }
    //     else dp[i][j]=func(i-1,j,s,t,dp);
    //     return dp[i][j];
    // }

    // METHOD 2 TABULATION
        public int numDistinct(String s, String t) {
        int n1=s.length();
        int n2=t.length();
        int[][] dp=new int[n1+1][n2+1];
        for(int i=0;i<=n1;i++){
            dp[i][0]=1;
        }
        // remember that for dp[0][0]==1 we above done so if we take j from 0 then it will overide
        for(int j=1;j<=n2;j++){
            dp[0][j]=0;
        }

        for(int i=1;i<=n1;i++){
            for(int j=1;j<=n2;j++){
                if(s.charAt(i-1)==t.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+dp[i-1][j];
                }
                else dp[i][j]=dp[i-1][j];
            }
        }
        return dp[n1][n2];
        
    }

}