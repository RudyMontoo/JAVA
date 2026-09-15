// class Solution {

//     public int findTargetSumWays(int[] nums, int target) {

//         int sum = 0;

//         for (int x : nums) {
//             sum += x;
//         }

//         if (target > sum || target < -sum) {
//             return 0;
//         }

//         int offset = sum;

//         int[][] dp = new int[nums.length][2 * sum + 1];

//         for (int[] row : dp) {
//             Arrays.fill(row, -1);
//         }

//         return func(nums.length - 1, nums, target, dp, offset);
//     }

//     public static int func(int idx, int[] nums, int trg,
//                            int[][] dp, int offset) {

//         if (idx == 0) {

//             int count = 0;

//             if (trg == nums[0])
//                 count++;

//             if (trg == -nums[0])
//                 count++;

//             return count;
//         }

//         if (dp[idx][trg + offset] != -1) {
//             return dp[idx][trg + offset];
//         }

//         int add = func(idx - 1,
//                        nums,
//                        trg - nums[idx],
//                        dp,
//                        offset);

//         int sub = func(idx - 1,
//                        nums,
//                        trg + nums[idx],
//                        dp,
//                        offset);

//         return dp[idx][trg + offset] = add + sub;
//     }
// }


// this method is very lengthy and not understandile 



class Solution {

    public int findTargetSumWays(int[] nums, int target) {
     
        int sum=0;
        for(var x: nums){
            sum+=x;
        }
         // Impossible target
        if (target > sum || target < -sum)
            return 0;

        // (sum + target) must be even
        if ((sum + target) % 2 != 0)
            return 0;

        int k=(sum+target)/2;
        int[][] dp=new int[nums.length+1][k+1];
        for(int[] row: dp){
            Arrays.fill(row,-1);
        }
        return func(nums.length-1, dp,k, nums);

    }

    public static int func(int idx,int[][] dp, int k, int[] arr){
        if(idx==0){
             if (k == 0 && arr[0] == 0)
            return 2;

        if (k == 0 || arr[0] == k)
            return 1;

        return 0;
        }
        if(dp[idx][k]!=-1)return dp[idx][k];
        int take=0;
        if(arr[idx]<=k){
            take = func(idx - 1, dp, k - arr[idx], arr);
        }
//        not take
        int notTake=func(idx-1,dp,k,arr);

        return dp[idx][k]=take+notTake;
    }
    }