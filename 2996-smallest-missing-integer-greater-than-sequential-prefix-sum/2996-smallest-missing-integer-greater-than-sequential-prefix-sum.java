class Solution {
    public int missingInteger(int[] nums) {
        int n = nums.length;

     
        int sum = nums[0];
        int idx = 0;

        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1] + 1) {
                sum += nums[i];
                idx = i;
            } else {
                break;
            }
        }


        int x = sum;

        while (true) {
            boolean found = false;

            for (int i = 0; i < n; i++) {
                if (nums[i] == x) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                return x;
            }

            x++;
        }
    }
}