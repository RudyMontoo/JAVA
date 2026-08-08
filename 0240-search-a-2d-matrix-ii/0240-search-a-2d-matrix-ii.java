class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int col = 0; col < cols; col++) {

            // Check whether target can exist in this column
            if (target >= matrix[0][col] &&
                target <= matrix[rows - 1][col]) {

                int low = 0;
                int high = rows - 1;

                while (low <= high) {
                    int mid = low + (high - low) / 2;

                    if (matrix[mid][col] == target) {
                        return true;
                    } 
                    else if (matrix[mid][col] < target) {
                        low = mid + 1;
                    } 
                    else {
                        high = mid - 1;
                    }
                }
            }
        }

        return false;
    }
}