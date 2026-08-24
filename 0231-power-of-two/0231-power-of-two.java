class Solution {
    public boolean isPowerOfTwo(int n) {
        // METHOD 1 check using set bits
        if(n<=0)return false;
       if((n & (n-1))==0)return true;
       return false;
    }
}