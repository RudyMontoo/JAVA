package REVISION_2026;
import java.util.*;
public class RotatedBinarySearchDuplicates {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] nums={2,5,6,0,0,1,2};
        int trg=0;
        System.out.println(search(nums,trg));
    }
    public static boolean search(int[] nums, int trg) {
        int n=nums.length;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==trg){
                return true;
            }
            if(nums[mid]==nums[low] &&  nums[mid]==nums[high]){
                low++;
                high--;
                continue;
            }

            if(nums[low]<=nums[mid]){
                if(nums[low]<=trg && trg<=nums[mid]){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else{
                if(nums[high]>=trg && trg>=nums[mid]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }

            }
        }
        return false;
    }
}
