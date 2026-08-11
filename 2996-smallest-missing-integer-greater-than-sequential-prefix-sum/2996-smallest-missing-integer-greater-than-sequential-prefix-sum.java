class Solution {
    public int missingInteger(int[] nums) {
        int n = nums.length;

        // Find the longest consecutive prefix
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

        // Start checking from the sum
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