class Solution {
    public int largestInteger(int[] nums, int k) {
        HashMap<Integer, Integer> map=new HashMap<>();
        int n=nums.length;
        if(k==nums.length){
            int max=-1;
            for(var x: nums){
                max=Math.max(max,x);

            }

            return max;
        }
        // if(k==1){
        //     int max=-1;
        //     HashMap<Integer,Integer> map1=new HashMap<>();
        //     for(var x: nums){
        //         map1.put(x,map1.getOrDefault(x,0)+1);
        //     }
        //     for(var key:map1.keySet()){
        //     if(map1.get(key)==1){
        //         max=Math.max(max,key);
        //     }
        // }
        //     return max;
        // }

        for(int i=0;i<=n-k;i++){
            for(int j=i;j<i+k;j++){
                map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            }
        }

        int ans=-1;
        for(var key:map.keySet()){
            if(map.get(key)==1){
                ans=Math.max(ans,key);
            }
        }
        return ans;
    }
}