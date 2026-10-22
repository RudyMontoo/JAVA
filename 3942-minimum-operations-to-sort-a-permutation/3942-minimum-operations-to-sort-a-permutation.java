import java.util.*;

class Solution {

    // Returns true if arr is exactly [0, 1, 2, ..., n-1]
    private boolean isSortedFromZero(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i) return false;
        }
        return true;
    }

    public int minOperations(int[] nums) {
        int n = nums.length;

        // STEP 1: find where 0 is (our anchor)
        // nums = [2,3,4,0,1]  ->  zeroIndex = 3
        int zeroIndex = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                zeroIndex = i;
                break;
            }
        }

        // STEP 2: read the circle FORWARD, starting from 0
        // nums = [2,3,4,0,1]  ->  forward = [0,1,2,3,4]
        int[] forward = new int[n];
        int pos = 0;
        for (int i = zeroIndex; i < n; i++) forward[pos++] = nums[i];   // 0 to end
        for (int i = 0; i < zeroIndex; i++) forward[pos++] = nums[i];   // start to before 0

        // STEP 3: read the circle BACKWARD, starting from 0
        // nums = [2,1,0,4,3]  ->  backward = [0,1,2,3,4]
        int[] backward = new int[n];
        pos = 0;
        for (int i = zeroIndex; i >= 0; i--) backward[pos++] = nums[i];   // 0 to start
        for (int i = n - 1; i > zeroIndex; i--) backward[pos++] = nums[i]; // end to after 0

        // STEP 4: cost of each case
        // Case A: nums is a rotation of sorted array (forward is sorted)
        //   option 1: rotate left zeroIndex times             -> zeroIndex
        //   option 2: reverse + (n - zeroIndex) rotates + reverse -> n - zeroIndex + 2
        int costIfRotation = Math.min(zeroIndex, n - zeroIndex + 2);

        // Case B: nums is a reversed rotation (backward is sorted)
        //   option 1: reverse + (n - zeroIndex - 1) rotates   -> n - zeroIndex
        //   option 2: (zeroIndex + 1) rotates + reverse       -> zeroIndex + 2
        int costIfReversedRotation = Math.min(n - zeroIndex, zeroIndex + 2);

        // STEP 5: decide the answer
        boolean isRotation = isSortedFromZero(forward);
        boolean isReversedRotation = isSortedFromZero(backward);

        if (isRotation && isReversedRotation) return Math.min(costIfRotation, costIfReversedRotation);
        if (isRotation) return costIfRotation;
        if (isReversedRotation) return costIfReversedRotation;
        return -1;   // neither case -> impossible
    }
}