package dynamicProgramming._2D;
import java.util.*;
public class ninja_technique {

////    METHOD 1 -> RECURSION
//public static void main(String[] args) {
//
//    int[][]  points = {{10, 40, 70}, {20, 50, 80}, {30, 60, 90}};
//    System.out.println(func(0,0,-1,points));
//
//
//
//}
//public static int func(int i, int j, int last, int [][] points){
//    if(i==points.length || j==points[0].length)return 0;
//    int max=0;
//    for(int x=0;x<points[0].length;x++){
//        if(last!=x){
//            int sum=points[i][x] + func(i+1,x,x,points);
//            max=Math.max(max,sum);
//        }
//    }
//    return max;
//
//}

//    //   METHOD 2-> MEMORIZATION (top to down approach)
//    public static void main(String[] args) {
//
//        int[][]  points = {{10, 40, 70}, {20, 50, 80}, {30, 60, 90}};
//        int n=points.length;
//        int[][] dp=new int[n+1][n+1];
//        for(int i=0;i<=n;i++){
//            for(int j=0;j<=n;j++){
//                dp[i][j]=-1;
//            }
//        }
//
//        System.out.println(func(n-1,3,points,dp));
//
//
//
//    }
//    public static int func(int i, int last, int [][] points, int[][] dp){
//        if(i<0 )return 0;
//        int max=0;
//        if(dp[i][last]!=-1)return dp[i][last];
//        for(int x=0;x<points[0].length;x++){
//            if(last!=x){
//                int sum=points[i][x] + func(i-1,x,points,dp);
//                max=Math.max(max,sum);
//
//            }
//        }
//        dp[i][last]=max;
//        return dp[i][last];
//
//    }




//   METHOD 2-> TABULATION (BOTTOM to UP approach)
public static void main(String[] args) {

    int[][] points = {{10, 40, 70}, {20, 50, 80}, {30, 60, 90}};
    int n = points.length;
    int[][] dp = new int[n][4];   // dp[day][last] -> last: 0,1,2 = excluded activity, 3 = none excluded

    // base case -> day 0
    for (int last = 0; last <= 3; last++) {
        int max = 0;
        for (int task = 0; task < n; task++) {
            if (task != last) {
                max = Math.max(max, points[0][task]);
            }
        }
        dp[0][last] = max;
    }

    // day 1 onward
    for (int day = 1; day < n; day++) {
        for (int last = 0; last <= 3; last++) {
            int max = 0;
            for (int task = 0; task < n; task++) {
                if (task != last) {
                    int point = points[day][task] + dp[day - 1][task];
                    max = Math.max(max, point);
                }
            }
            dp[day][last] = max;
        }
    }

    System.out.println(dp[n - 1][3]);
}

}

