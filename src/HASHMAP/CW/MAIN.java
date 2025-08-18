package HASHMAP.CW;

import java.util.HashMap;
import java.util.Map;

public class MAIN {
    static void HASHMAPMETHOD(){
        //syntax
        Map<String,Integer> mp = new HashMap<>();
        //adding element
        mp.put("Akash",21);
        mp.put("Yash",16);
        mp.put("Lav",17);
        mp.put("Rishika",19);
        mp.put("Harry",22);
        //gett value from the key
        System.out.println(mp.get("Akash"));//21
        System.out.println(mp.get("Rahul"));//null

        //changing/ updating the value
        mp.put("Akash",25);
        System.out.println(mp.get("Akash"));

//        mp.remove("Akash");
//        System.out.println(mp.get("Akash") );

        System.out.println(mp.remove("Akash") );
        System.out.println(mp.containsKey("Akash"));
        System.out.println(mp.containsKey("Yash"));
        //adding element only if it doesn,t exist
        mp.putIfAbsent("Yash",25);
        mp.putIfAbsent("Yashika",25);
        System.out.println(mp.get("Yashika"));

        //get all the key
        System.out.println(mp.keySet());
        //get all the value
        System.out.println(mp.values());
        //get both
        System.out.println(mp.entrySet());
        //traversing
        //M1
        for(String key : mp.keySet()){
            System.out.println("Age of "+key+" is "+mp.get(key)+"");
        }
        System.out.println();
        //M2
            for(Map.Entry<String,Integer> e : mp.entrySet()){
                System.out.printf("Age of %s is %d\n",e.getKey(),e.getValue());
            }
        //M3
        System.out.println();
        for(var e : mp.entrySet()){
            System.out.printf("Age of %s is %d\n",e.getKey(),e.getValue());
        }

    }
    public static void main(String[] args) {
        HASHMAPMETHOD();
    }

}
