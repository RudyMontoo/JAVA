class Solution {
    public long maxAlternatingSum(int[] nums) {
        // long sum=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            nums[i]=Math.abs(nums[i]);
        }
        Arrays.sort(nums);
        long sum=0;
        int idx=n-1;
        for(int i=0;i<n;i+=2){
            sum+=(long)Math.pow(nums[idx--],2);
            
        }
        for(int i=1;i<n;i+=2){
                sum-=(long)Math.pow(nums[idx--],2);
          
        }
        return sum;

    }
}