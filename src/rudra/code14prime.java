package rudra;

import java.util.Scanner;

public class code14prime {

    //PRIME 1
//    public static void main(String[] args) {
//        System.out.println("Enter your number : ");
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        primeCheck(n);
//
//    }
//    static void primeCheck(int a){
//        int count=0;
//        for(int i=2;i<a;i++){
//            if(a%i==0){
//                count++;
//            }
//        }
//        if(count!=0){
//            System.out.println("Your number is not a prime number");
//        }
//        else{
//            System.out.println("Your number is a prime number");
//        }
//    }


    //PRIME 2
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your first number:");
        int n1=sc.nextInt();
        System.out.println("Enter your second number:");
        int n2=sc.nextInt();
        primeprint(n1,n2);
    }
    static void primeprint(int a,int b){

        for(int i=a;i<=b;i++){
            int count=0;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==0){
                System.out.println(i);
            }
        }
    }
}

