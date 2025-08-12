package recursion;

import java.util.Scanner;

public class removeappbutnotapple {
    static String removeAppFromStr(String str,int up,StringBuilder sb) {


        if(up>=str.length())return sb.toString();

        if(up+5<=str.length() && str.substring(up,up+3).equals("app") && !str.substring(up,up+5).equals("apple")){

            return removeAppFromStr(str,up+3,sb);
        }

        else {
            sb.append(str.charAt(up));

            removeAppFromStr(str, up + 1, sb);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        int ind=0 ;
        String ans=removeAppFromStr(str,ind,sb);
        System.out.println(ans);
    }

}
