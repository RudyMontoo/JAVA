class Solution {
    public int minDistance(String word1, String word2) {
        int n1=word1.length();
        int n2=word2.length();
        int[][] dp=new int[n1+1][n2+1];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return func(n1-1, n2-1, word1, word2,dp);

    }

    public int func(int i, int j, String s, String t, int[][] dp){
        if(j<0)return i+1 ;
        if(i<0)return j+1;
        if(dp[i][j]!=-1)return dp[i][j];

        if(s.charAt(i)==t.charAt(j)){
            dp[i][j]=0+func(i-1,j-1,s,t,dp);
        }
        else{
            // delete
            // func(i-1,j,s,t,dp);
            // insert
            //func(i,j-1,s,t,dp);
            // replace
            // func(i-1,j-1,s,t,dp);
            dp[i][j]=1+Math.min(func(i-1,j,s,t,dp),Math.min(func(i,j-1,s,t,dp),func(i-1,j-1,s,t,dp)));
        }
            return dp[i][j];
        
    }
}