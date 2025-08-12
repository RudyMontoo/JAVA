package MATHDSA;

import java.util.Scanner;

public class binarysearchsqrt {
    static double sqrt(int n,int p){
    int s=0;
    int e=n;
    double root=0.0;

    while(s<=e){
        int mid=s+(e-s)/2;

        if(mid*mid==n){

            return mid;
        }
        else if(mid*mid>n){
            e=mid-1;
        }
        else{
            s=mid+1;
            root=mid;
        }
    }
    double incr=0.1;
    for(int i=0;i<p;i++){
        while(root*root<=n){
            root+=incr;
        }
        root-=incr;
        incr/=10;
    }
    return root;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int num1 = input.nextInt();
        int p=input.nextInt();
        System.out.println(sqrt(num1,p));
        input.close();
    }
}
