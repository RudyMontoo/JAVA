package binarySearchInterviewproblem;

import java.util.Scanner;


public class ceilingofumber {
    static int ceiling(int[] nums,int key){
        int left=0;
        int right=nums.length-1;
        int ans=-1;

        while(left<=right){
            int mid=left+(right-left)/2;

            if(nums[mid]==key){

                return nums[mid];

            }

            else if(nums[mid]>key){
                ans=nums[mid];
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        ceilingofumber sol=new ceilingofumber();
        int result=sol.ceiling(arr,target);
        System.out.println(result);
    }
}
