package sorting;

import java.util.Scanner;

public class selectionsort {
    static void selectionsort(int[] arr,int n){

        for(int i=n-1;i>=0;i--){
            int largest=arr[i];
            int index=i;
            for(int j=i-1;j>=0;j--){
                if(arr[j]>largest){
                  largest=arr[j];
                  index=j;
                }
            }
           int temp=arr[index];
            arr[index]=arr[i];
            arr[i]=temp;

        }
    }
    public static void main(String[] args) {
        System.out.println("SELECTION  SORTING");
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

        selectionsort(arr,n);

        System.out.println("Array after sorting");
        for(int i=0;i<n;i++){
            System.out.print(" "+arr[i]);
        }

    }
}
