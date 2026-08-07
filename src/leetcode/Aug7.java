package leetcode;

import java.util.Scanner;

public class Aug7 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] bloomDay=new int[n];
        for(int i=0;i<n;i++){
            bloomDay[i]=sc.nextInt();
        }
        int m= sc.nextInt();
        int k=sc.nextInt();
        System.out.println(minDays(bloomDay,m,k));

    }
    public static int minDays(int[] bloomDay, int m, int k) {
        if ((long)m*k>bloomDay.length)return -1;
        int high=0;
        for(var x : bloomDay){
            high=Math.max(high, x);
        }
        int low=1;
        int ans=Integer.MAX_VALUE;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(get(mid,bloomDay,m,k)){
                ans=Math.min(ans,mid);
                high=mid-1;
            }
            else{
                low=mid+1;
            }

        }
        return ans;

    }

    public static boolean get(int day, int[] bloomDay, int m, int k) {
        int flowers = 0;
        int bouquets = 0;

        for (int i = 0; i < bloomDay.length; i++) {
            if (bloomDay[i] <= day) {
                flowers++;

                if (flowers == k) {
                    bouquets++;
                    flowers = 0;
                }
            } else {
                flowers = 0;
            }
        }

        return bouquets >= m;
    }
}
