class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Binary search for the possible row
        int low = 0;
        int high = rows - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (target >= matrix[mid][0] && target <= matrix[mid][cols - 1]) {
                // Binary search inside this row
                int l = 0;
                int r = cols - 1;

                while (l <= r) {
                    int m = l + (r - l) / 2;

                    if (matrix[mid][m] == target) {
                        return true;
                    } else if (matrix[mid][m] < target) {
                        l = m + 1;
                    } else {
                        r = m - 1;
                    }
                }

                return false;
            }

            if (target < matrix[mid][0]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return false;
    }
}