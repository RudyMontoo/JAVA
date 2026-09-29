import java.util.Scanner;
class Solution {

    public double findMedianSortedArrays(int[] nums1, int[] nums2){
        int n = nums1.length;
        int m = nums2.length;
        int[] arr=new int[n+m];
        System.arraycopy(nums1, 0, arr, 0, n);
        System.arraycopy(nums2, 0, arr, n, m);
        Arrays.sort(arr);

        int n1=n+m;
        int mid=n1/2;
        double median;
        if(n1%2==0){
           
            median=(double)(arr[mid]+arr[mid-1])/2;
        }
        else{
            median=(double)arr[mid];
        }
        
        return median;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums1 = new int[n];
        int[] nums2 = new int[n];
        for(int i = 0; i < n; i++){
            nums1[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            nums2[i] = sc.nextInt();
        }
        Solution sol = new Solution();
        double result = sol.findMedianSortedArrays(nums1,nums2);
        System.out.println(result); // For clean output
    }
}