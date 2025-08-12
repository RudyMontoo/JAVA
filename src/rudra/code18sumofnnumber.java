package rudra;

import java.util.Scanner;

public class code18sumofnnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int printsum=sumOfN(n);
        System.out.println(printsum);
    }
    static int sumOfN(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        return sum;
    }
}
