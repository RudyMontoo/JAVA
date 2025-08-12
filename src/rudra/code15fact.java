package rudra;

import java.util.Scanner;

public class code15fact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int n = sc.nextInt();
        int result=fact(n);
        System.out.println(result);
    }
    public static int fact(int x){
        int res=1;
        for(int i=1;i<=x;i++){
            res=res*i;
        }
        return res;
    }
}
