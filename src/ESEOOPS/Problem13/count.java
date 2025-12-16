package ESEOOPS.Problem13;
import java.util.*;
public class count {
    public static void main(String[] args) {
        Scanner sc=new  Scanner(System.in);
        String str=sc.next();
        TreeMap<String,Integer> map=new TreeMap<>();
        for(int i=0;i<str.length();i++){
            String str1=str.substring(i,i+1);
            map.put(str1,map.getOrDefault(str1,0) + 1);
        }
        System.out.println(map);
    }
}
