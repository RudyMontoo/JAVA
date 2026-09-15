class Solution {
     
    public int findTargetSumWays(int[] nums, int target) {
        return func(nums.length-1, nums, target);
    }

    public static int func(int idx, int[] nums, int trg){
        if (idx < 0) {
    return trg == 0 ? 1 : 0;
}

        // add
        int add=func(idx-1,nums, trg-nums[idx]);
        
        // subtract
        int sub=func(idx-1,nums,trg+nums[idx]);
        
        return add+sub;
        

    }
}