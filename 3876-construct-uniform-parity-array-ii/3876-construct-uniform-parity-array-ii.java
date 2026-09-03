class Solution {
    public boolean uniformArray(int[] nums1){
        int min=Integer.MAX_VALUE;
        int n=nums1.length;
    
        for(var x: nums1){
            min=Math.min(x,min);
        }
        return func1(nums1,min);
        
    }

    public boolean func1(int[] nums, int min){
        if(nums.length<=1)return true;
        if(min%2==0){
            for(int i=0;i<nums.length;i++){
                if(nums[i]%2!=0){
                    nums[i]=nums[i]-min;
                    if(nums[i]%2!=0)return false;
                }
            }
        }
        else{
            for(int i=0;i<nums.length;i++){
                if(nums[i]%2==0){
                    nums[i]=nums[i]-min;
                    if(nums[i]%2==0)return false;
                }
            }
        }


        return true;
    }
}