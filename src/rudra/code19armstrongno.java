package rudra;

import java.util.Scanner;

public class code19armstrongno {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        armstrongcheck(n);
    }
    static void armstrongcheck(int n){
        int sum=0;
        int count=0;
        int n4=n;
        int n3=n;
        while(n!=0){
            int n1=n%10;
            n=n/10;
            count++;
        }

        while(n3!=0){
            int n1=n3%10;
            int n2= (int) Math.pow(n1,count);
            sum+=n2;
            n3=n3/10;
        }
        if(sum==n4){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not Armstrong number");
        }
    }
}
