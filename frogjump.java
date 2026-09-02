package dynamicProgramming;
import java.util.*;
public class frogjump {
    public static void main(String[] args) {
        int n = 5;
        int[] heights = {7, 5, 1, 2, 6};
        int[] dp=new int[n+1];
        for(int i=0;i<dp.length;i++){
            dp[i]=-1;
        }
//       System.out.println(func1(0, 0, heights,dp));   //MEMOIZATION


        //    method 2 TABULATION
        dp[0]=0;
        for(int i=1;i<n;i++){
            int step1=Integer.MAX_VALUE;
            if(i-1>=0) {
                step1 = Math.abs(heights[i] - heights[i - 1]) + dp[i - 1];
            }
            int step2=Integer.MAX_VALUE;
            if(i-2>=0) {
                step2 = Math.abs(heights[i] - heights[i - 2]) + dp[i - 2];
            }
            dp[i]=Math.min(step1,step2);
        }
        System.out.println(dp[n-1]);
    }
//    method 1 MEMOIZATION
    public static int func1(int idx, int energy, int [] height,int[] dp){
        if(idx>=height.length-1)return energy;
        if(dp[idx]!=-1)return dp[idx];
        int step1=Integer.MAX_VALUE;
        if(idx+1<height.length) {
            step1 = Math.abs(height[idx] - height[idx + 1]) + func1(idx + 1, energy, height,dp);
        }
        int step2=Integer.MAX_VALUE;
        if(idx+2<height.length) {
            step2 = Math.abs(height[idx] - height[idx + 2]) + func1(idx + 2, energy, height,dp);
        }
        dp[idx]=Math.min(step1,step2);

        return dp[idx];
    }


}
