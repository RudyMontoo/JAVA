package bitwiseoperator;

import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a base");
        int base= input.nextInt();
        System.out.println("Enter a power");
        int pow = input.nextInt();
        int ans = 1;
        while(pow>0){
            if((pow&1)==1){
                ans*=base;
            }
            base*=base;
            pow=pow>>1;
        }
        System.out.println(ans);
    }
}
