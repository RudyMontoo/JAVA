package leetcode;
import java.util.*;
public class JUNE24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int l=sc.nextInt();
        int r=sc.nextInt();
        System.out.println(zigZagArrays(n,l,r));
    }
        public static int zigZagArrays(int n, int l, int r) {

            int mod=(int)(1e9+7);
            int[] dp=new int[r+1];
            Arrays.fill(dp,1);
            for(int i=1;i<n;i++){
                int[] next_dp=new int[r+1];
                if(i%2==1){
                    long pre=0;
                    for(int x=l;x<=r;x++){
                        next_dp[x]=(int)pre;
                        pre=(pre+dp[x])%mod;

                    }
                }
                else{
                    long suff=0;
                    for(int x=r;x>=l;x--){
                        next_dp[x]=(int)suff;
                        suff=(suff+dp[x])%mod;
                    }
                }
                dp=next_dp;

            }
            long count=0;
            for(int x=l;x<=r;x++){
                count=(count+dp[x])%mod;
            }
            return (int)((count*2)%mod);

        }
    }

