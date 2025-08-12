package stringandstringmetod;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder name = new StringBuilder(scan.nextLine());
        String a=name.toString();
        String b=name.reverse().toString();
       if(a.equals(b)){
           System.out.println("palindrome");
       }
       else{
           System.out.println("not palindrome");
       }


    }
}
