package leetcode;

public class Aug7b {
    public static void main(String[] args) {

        int[][] mat = {
                {1, 4},
                {3, 2}
        };
        Aug7b solution = new Aug7b();
        int[] peak = solution.findPeakGrid(mat);
        System.out.println("Peak found at: [" + peak[0] + ", " + peak[1] + "]");
    }
    public int[] findPeakGrid(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;

        int low = 0;
        int high = cols - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Find row having maximum element in mid column
            int maxRow = 0;
            for (int i = 1; i < rows; i++) {
                if (mat[i][mid] > mat[maxRow][mid]) {
                    maxRow = i;
                }
            }

            int left = (mid == 0) ? -1 : mat[maxRow][mid - 1];
            int right = (mid == cols - 1) ? -1 : mat[maxRow][mid + 1];

            if (mat[maxRow][mid] > left && mat[maxRow][mid] > right) {
                return new int[]{maxRow, mid};
            } else if (left > mat[maxRow][mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return new int[]{-1, -1};
    }
}
