package rudra;

import java.util.Scanner;

public class code10reverse_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int b=0;
        int c=0;
        while(num!=0){
            int a=num%10;
            b+=a;
            b=b*10;
            num=num/10;
        }
        b=b/10;
        System.out.println("The reverse number is "+b+" ");
    }
}
