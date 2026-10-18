class Solution {
    public int minDeletions(int[] nums) {
        int count=0;
        int prev=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                count++;
            }
            else{
                prev=nums[i];
            }
        }
        return count;
        
    }
}