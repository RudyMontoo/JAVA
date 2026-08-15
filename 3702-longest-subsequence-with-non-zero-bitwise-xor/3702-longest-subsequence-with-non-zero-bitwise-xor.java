class Solution {
    public int longestSubsequence(int[] nums) {
        int res=0;
        long sum=0;
        for(int j:nums){
        sum+=(long) j;
        }
        if(sum==0){
            return 0;
        }
        for(int i:nums){
            res^=i;
        }
        if(res==0){
            return nums.length-1;
        }
        return nums.length;
    }
}