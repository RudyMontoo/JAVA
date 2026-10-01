// method 1 recursion + backtracking  47/49
// class Solution {
//     public List<Integer> largestDivisibleSubset(int[] nums) {
//         Arrays.sort(nums);
//         return func(0,-1,nums, new ArrayList<>());
        
//     }

//     public List<Integer> func(int idx, int prev, int[] nums, List<Integer> list){
//         if(idx>=nums.length)return new ArrayList<>(list);
//         // take 
//         List<Integer> take=new ArrayList<>();
//         if(prev==-1 || nums[idx]%nums[prev]==0){
//             list.add(nums[idx]);
//             take=func(idx+1,idx,nums,list);
//             list.remove(list.size()-1);
//         }
//         List<Integer> notTake=func(idx+1,prev,nums,list);
//         if(take.size()>notTake.size())return take;
//         return notTake;
        
//     }
// }


// method 2 tabulation
class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        List<Integer> list=new ArrayList<>();
       int n=nums.length;
       Arrays.sort(nums);
        int maxi=1;
        int lastIdx=0;
        int[] dp=new int[n];
        Arrays.fill(dp,1);
        int[] parent=new int[n];
        for(int i=0;i<n;i++){
            parent[i]=i;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[i]%nums[j]==0 && dp[j]+1>dp[i]){
                    dp[i]=dp[j]+1;
                    parent[i]=j;
                }
            }
            if(dp[i]>maxi){
                maxi=dp[i];
                lastIdx=i;
            }
        }
        while(parent[lastIdx]!=lastIdx){
            list.add(nums[lastIdx]);
            lastIdx=parent[lastIdx];
        }
        list.add(nums[lastIdx]);
        Collections.reverse(list);
        return list;
        
    }
}