package sorting;

import java.util.Scanner;

public class insertionsort {
    static void insertionsort(int[] arr,int n){

        for(int i=0;i<n-1;i++){
            int element=arr[i];
            int index=i;
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
                else{
                    break;
                }
            }


        }
    }
    public static void main(String[] args) {
        System.out.println("INSERTION SORTING");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Array before sorting");
        for(int i=0;i<n;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();

        insertionsort(arr,n);

        System.out.println("Array after sorting");
        for(int i=0;i<n;i++){
            System.out.print(" "+arr[i]);
        }

    }
}
