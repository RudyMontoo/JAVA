class Solution {
    public int sortPermutation(int[] nums) {
        int n=nums.length;
        int k=-1;
        boolean misplaced=false;
        for(int i=0;i<n;i++){
            if(nums[i]!=i){
                k=k&nums[i];
                misplaced=true;
            }
        }

        return misplaced?k:0;
    }
}