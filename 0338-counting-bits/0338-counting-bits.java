class Solution {
    public int[] countBits(int n) {
        int[] a=new int[n+1];
        for(int i=0;i<=n;i++){
            int ans=0;
            int num=i;
            while(num>0){
                int x=num&1;
                if(x==1)ans++;
                num=num>>1;
            }
            a[i]=ans;
        }
        return a;
    }
}