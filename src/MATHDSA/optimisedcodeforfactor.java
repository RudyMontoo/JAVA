package MATHDSA;

import java.util.Scanner;

public class optimisedcodeforfactor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        factor(n);
    }
    static void factor(int n){
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                if(i==n/i){
                    System.out.println(i);
                }
                else{
                    System.out.print(i +" "+n/i+" ");
                }
            }
        }
    }
}
