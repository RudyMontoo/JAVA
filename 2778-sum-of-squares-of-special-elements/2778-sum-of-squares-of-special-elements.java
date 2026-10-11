class Solution {
    public int sumOfSquares(int[] nums) {
        int n=nums.length;
        int sum=0;
        int i=1;
        for(var x:nums){
            if(n%i==0)sum+=(int)x*x;
            i++;
        }
        return sum;
    }
}