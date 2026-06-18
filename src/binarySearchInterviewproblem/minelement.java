package binarySearchInterviewproblem;
import java.util.*;
public class minelement {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] nums={3,4,5,1,2};
        System.out.println(findMin(nums));
    }
        public static int findMin(int[] nums) {
            int n=nums.length;

            int low=0;
            int high=n-1;
            while (low < high) {
                int mid = low + (high - low) / 2;

                if (nums[mid] > nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid;
                }
            }
            return nums[low];
        }

}
