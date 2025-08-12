package recursion;

import java.util.Scanner;

public class linearserachwithrecursion {
    static boolean search(int[] nums,int ele,int m){
        if(m==nums.length){return false;}
       return (nums[m]==ele)||search(nums,ele,m+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        boolean result= search(numbers,target,0);
        if(result){
            System.out.println("Exists");
        }
        else{
            System.out.println("Not Exists");
        }
    }
}
