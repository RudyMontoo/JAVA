package binarySearchInterviewproblem;

import java.util.Scanner;

public class linearserchin2darray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int target=sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==target){
                    count=1;
                }

            }
        }
        if(count==1){
            System.out.println("found");
        }
        else{
            System.out.println("not found");
        }
    }
}
