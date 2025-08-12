package recursion;

import java.util.ArrayList;

public class numof_diceroll_targetsum {
    public static void main(String[] args) {
//      diceroll("",4);
        System.out.println(dicerolllist("",4));
        int result=counting("",4);
        System.out.println(result);
    }
//    static void diceroll(String p, int sum){
//        if(sum==0){
//            System.out.println(p);
//            return;
//        }
//
//        for(int i=1;i<6&&i<=sum;i++){
////             char ch=(char)('a'+i);
//             diceroll(p+i,sum-i);
//
//        }
//}



static ArrayList<String> dicerolllist(String p, int sum){
    if(sum==0){
        ArrayList<String> list = new ArrayList<>();
        list.add(p);
        return list;
    }
    ArrayList<String> list = new ArrayList<>();

    for(int i=1;i<6&&i<=sum;i++){
        list.addAll(dicerolllist(p+i,sum-i));

    }
    return list;
}



    static int counting(String p, int sum){
        if(sum==0){
            return 1;
        }
        int count=0;

        for(int i=1;i<6&&i<=sum;i++){

            count =count + counting(p+i,sum-i);

        }
        return count;
    }
}
