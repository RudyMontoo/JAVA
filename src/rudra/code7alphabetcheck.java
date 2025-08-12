package rudra;

import java.util.Scanner;

public class code7alphabetcheck {
    public static void main(String[] args) {
        System.out.println("Enter your value : ");
        Scanner sc = new Scanner(System.in);
        char val=sc.next().charAt(0);
        int x=(int)val;
        if(x>=97&&x<=122){
            System.out.println("The given value is alphabet (Small)");
        }
        else if(x>=65&&x<=90){
            System.out.println("The given value is albhabet (Capital)");
        }
        else{
            System.out.println("The given val is not an alphabet");
        }
    }
}
