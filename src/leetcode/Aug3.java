package leetcode;

import java.util.Scanner;

public class Aug3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] stoneValue=new int[n];
        for(int i=0;i<n;i++){
            stoneValue[i]=sc.nextInt();
        }
        System.out.println(stoneGameIII(stoneValue));
    }
        public static String stoneGameIII(int[] stoneValue) {
            int n=stoneValue.length;
            int[] dp=new int[n+1];
            // here dp represent as diff of your current best move score and your opponent best score
            dp[n]=0;
            for(int i=n-1;i>=0;i--){
                dp[i]=Integer.MIN_VALUE;
                int sum=0; // so it will calculate the sum of value u take (1, 1 2, 1 2 3)
                for(int k=1;k<=3&&i+k-1<n;k++){
                    sum+=stoneValue[i+k-1]; //
                    dp[i]=Math.max(dp[i],sum-dp[i+k]);
                }
            }

            // if(dp[n]==0)return "Tie";
            // else if(dp[n]<0)return "Bob";
            // else return "Alice";

            // we cant do this because u are going right to left
            // Hence ur ans would be at dp[0]

            if(dp[0]==0)return "Tie";
            else if(dp[0]<0)return "Bob";
            else return "Alice";
        }

}

