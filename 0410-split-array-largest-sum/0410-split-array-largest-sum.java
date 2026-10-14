class Solution {
    public int splitArray(int[] nums, int k){
        // if(nums.length<=k)return 0;
        int n=nums.length;
        int ans=-1;
        int low=0;
        int high=0;
        // low=max element of arra
        for(int i=0;i<n;i++){
            low=Math.max(low,nums[i]);
            high+=nums[i];
        }
        while(low<=high){
            int mid=(low+high)/2;
            if(possible(mid,nums,k)){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }

    public boolean possible(int mid, int[] arr, int k){
        int x=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]+sum>mid){
                x++;
                sum=arr[i];
            }
            else sum+=arr[i];
        }
        if(x+1<=k)return true;
        else return false;
    }
}