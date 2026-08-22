class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int prd=1;
        int num=n;
        if(n<10)return false;
        while(num>0){
            sum+=num%10;
            prd*=num%10;
            num=num/10;
        }
        
        return n%(sum+prd)==0?true:false;

    }
}