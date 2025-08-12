package recursion;


import java.util.Scanner;
public class REMOVEAFROMSTR {
    static String removeAFromStr(String str,int up,StringBuilder sb) {


        if(up==str.length())return sb.toString();

        if(str.charAt(up) != 'a'){
            sb.append(str.charAt(up));

        }

            removeAFromStr(str,up+1,sb);

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        int ind=0 ;
        String ans=removeAFromStr(str,ind,sb);
        System.out.println(ans);
    }
}
