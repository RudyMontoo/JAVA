package COLLECTION_fRAMEWORK;
import java.util.*;
public class MapInterface {
    public static void main(String[] args) {
           Map<Integer,String> map=new HashMap<>();
           map.put(1,"aman");
           map.put(2,"bhola");
           map.put(3,"rudra");
           map.putIfAbsent(1,"karan");
           //iterating over value in a map
        for(var i:map.values()){
            System.out.println(i);
        }
        //iterating over key
        for(var i:map.keySet()){
            System.out.println(i);
        }

//        System.out.println(map);
//        System.out.println(map.entrySet());
//        System.out.println(map.get(1));
//        System.out.println(map.containsKey(1));
//        System.out.println(map.containsValue("rudra"));
//        System.out.println(map.values());
//        System.out.println(map.keySet());
    }
}
