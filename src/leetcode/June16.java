package leetcode;
import java.util.*;
public class June16 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(processStr(s));
    }
    public static  String processStr(String s) {
        StringBuffer sb=new StringBuffer();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='*'){
                if(sb.length()!=0){
                    sb.deleteCharAt(sb.length() - 1);
                }
            }
            else if(s.charAt(i)=='#'){
                sb.append(sb);
            }
            else if(s.charAt(i)=='%'){
                sb.reverse();
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
