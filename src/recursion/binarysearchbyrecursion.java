package recursion;

import java.util.Scanner;

public class binarysearchbyrecursion {
    static int binarysearch(int arr[] ,int left, int right,int ele){
        if(left>right)return -1;
            int mid=left+(right-left)/2;
            if(ele==arr[mid])return mid;
            else if(ele>arr[mid]){
                return  binarysearch(arr,left,mid-1,ele);
            }
            else{
                return  binarysearch(arr,mid+1,right,ele);
            }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ele=sc.nextInt();
        int left=0;
        int right=n-1;
        int result=-1;
        result=binarysearch(arr,left,right,ele);
        if(result==-1){
            System.out.println("not found");
        }
        else{
            System.out.println(result);
        }
    }
}
