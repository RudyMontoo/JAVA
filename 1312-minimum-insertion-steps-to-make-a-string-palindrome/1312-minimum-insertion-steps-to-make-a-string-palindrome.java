class Solution {
    // METHOD 1
//     public int minInsertions(String s) {
//         int n = s.length();

//         int[][] dp = new int[n][n];

//         for (int i = 0; i < n; i++) {
//             Arrays.fill(dp[i], -1);
//         }

//         return func(0, n - 1, s, dp);
//     }

//     public int func(int i, int j, String s, int[][] dp) {

//         // Base case
//         if (i >= j) {
//             return 0;
//         }

//         // Already calculated
//         if (dp[i][j] != -1) {
//             return dp[i][j];
//         }

//         // Characters match
//         if (s.charAt(i) == s.charAt(j)) {
//             return dp[i][j] = func(i + 1, j - 1, s, dp);
//         }

//         // Characters don't match
//         return dp[i][j] = 1 + Math.min(
//             func(i + 1, j, s, dp),
//             func(i, j - 1, s, dp)
//         );
//     }
// }




// METHOD 2

    public int minInsertions(String s) {
        int n = s.length();

        int[][] dp = new int[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }

        return n-func(0, n - 1, s, dp);
    }

    public int func(int i, int j, String s, int[][] dp) {

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