package dynamicProgramming;
import java.util.*;
public class frogkjump {
    public static void main(String[] args) {

        int[] heights = {10, 5, 20, 0, 15};
        int n = heights.length;
        int k=2;   // ab do do step jump karega
        int[] dp=new int[n+1];
        for(int i=0;i<dp.length;i++){
            dp[i]=-1;
        }
       System.out.println(func1(0,k, heights,dp));   //MEMOIZATION

    }
    //    method 1 MEMOIZATION
    public static int func1(int idx, int k, int [] height,int[] dp){
        if(idx>=height.length-1)return 0;
        if(dp[idx]!=-1)return dp[idx];
        int minEnergy=Integer.MAX_VALUE;
        for(int i=1;i<=k;i++){
            if(idx+i<height.length) {
                dp[idx] = Math.abs(height[idx] - height[idx + i]) + func1(idx + i, k, height, dp);
                minEnergy=Math.min(minEnergy, dp[idx]);
            }
        }

        return dp[idx];
    }
}
