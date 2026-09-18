class Solution {
    public int minDistance(String str1, String str2) {
       int n1=str1.length();
        int n2=str2.length();
        int[][] dp = new int[n1+1][n2+1]; // extra row/col of zeros
        for(int i=1;i<=n1;i++){
            for(int j=1;j<=n2;j++){
                if(str1.charAt(i-1)==str2.charAt(j-1))
                    dp[i][j] = 1 + dp[i-1][j-1];
                else
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
        return n1+n2-2*dp[n1][n2];
    }
}