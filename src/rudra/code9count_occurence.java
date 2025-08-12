package rudra;

import java.util.Scanner;

public class code9count_occurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        System.out.println("Enter a number to count in above number: ");
        int n=sc.nextInt();
        int count=0;
        while(num!=0){
            int a=num%10;
            if(a==n){
                count++;
            }
            num=num/10;
        }
        System.out.println(
                "The count of above number is "+count
        );
    }
}
