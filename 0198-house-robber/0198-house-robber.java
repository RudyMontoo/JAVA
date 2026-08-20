// class Solution {
//     int ans=0;
//     public int rob(int[] nums){
     
//         int n=nums.length-1;
//             func(n,0,nums);

   
//         return ans;
//     }


//     public void func(int idx, int sum, int[] nums){
//         if(idx<0){
//             ans=Math.max(ans,sum);
//             return;
//         }
       
        

//         // pick
//         func(idx-2,sum+nums[idx],nums);

//         // not pick
//         func(idx-1,sum,nums);

        

//     }
// }


import java.util.*;

class Solution {
    int[] dp;

    public int rob(int[] nums) {
        dp = new int[nums.length];
        Arrays.fill(dp, -1);

        return func(nums.length - 1, nums);
    }

    public int func(int idx, int[] nums) {
        if (idx < 0)
            return 0;

        if (dp[idx] != -1)
            return dp[idx];

        int pick = nums[idx] + func(idx - 2, nums);
        int notPick = func(idx - 1, nums);

        return dp[idx] = Math.max(pick, notPick);
    }
}