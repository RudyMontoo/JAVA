package bitwiseoperator;

import java.util.Scanner;

public class magicnumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number=input.nextInt();
        int base=5;
        int ans=0;
        while(number!=0){
            int last=number&1;
            number=number>>1;
            ans+=last*base;
            base=base*5;

        }
        System.out.println(ans);
    }
}
