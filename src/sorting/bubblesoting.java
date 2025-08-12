package sorting;

import java.util.Scanner;

public class bubblesoting {
    static void swap(int[] arr,int n){

        for(int i=0;i<n;i++){
            boolean swapped=false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
            if(swapped){
//                System.out.println("Already sorted");
                break;
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("BUBBLE SORTING");
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

        swap(arr,n);

        System.out.println("Array after sorting");
        for(int i=0;i<n;i++){
            System.out.print(" "+arr[i]);
        }

    }
}
