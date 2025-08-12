package recursion;

import java.util.ArrayList;

public class GOOGLE_lettercombinationofaphonenum {
    public static void main(String[] args) {
//        phonepad("","12");
        System.out.println(phonepad("","12"));
        int result=counting("","12");
        System.out.println(result);
    }
//    static void phonepad(String p, String up){
//        if(up.isEmpty()){
//            System.out.println(p);
//            return;
//        }
//        int digit=up.charAt(0)-'0';//this will convert"2" to 2
//        for(int i=(digit-1)*3;i<digit*3;i++){
//             char ch=(char)('a'+i);
//             phonepad(p+ch,up.substring(1));
//
//        }

    static ArrayList<String> phonepad(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        int digit=up.charAt(0)-'0';//this will convert"2" to 2
        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch=(char)('a'+i);
            list.addAll(phonepad(p+ch,up.substring(1)));

        }
        return list;
    }


    static int counting(String p, String up){
        if(up.isEmpty()){
            return 1;
        }
        int count=0;
        int digit=up.charAt(0)-'0';//this will convert"2" to 2
        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch=(char)('a'+i);
            count =count + counting(p+ch,up.substring(1));

        }
        return count;
    }
}
