class Solution {
    public boolean canJump(int[] nums){
        if(nums.length==1)return true;
        int n=nums.length;
        int maxIndex=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0 && maxIndex<=i)return false;
            maxIndex=Math.max(maxIndex,i+nums[i]);
            if(maxIndex>=n-1)return true;
        }
        return false;
    }
}