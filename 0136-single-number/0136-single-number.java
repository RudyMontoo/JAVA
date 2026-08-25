class Solution {
    public int singleNumber(int[] nums) {
        int ans=0;
        for(var x: nums){
            ans^=x;
        }
        return ans;
    }
}