package array;

import java.util.Scanner;

public class problem1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr=new int[n][m];
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
    }
}
