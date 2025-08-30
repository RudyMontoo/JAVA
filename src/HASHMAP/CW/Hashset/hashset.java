package HASHMAP.CW.Hashset;

import java.util.HashSet;

public class hashset {
    public static void main(String[] args) {
        HashSet<String> mp=new  HashSet<>();
        mp.add("Rudra");
        mp.add("Atul");
        mp.add("Sachin");
        System.out.println(mp);
        mp.remove("Rudra");
        System.out.println(mp);
        System.out.println(mp.contains("Rudra"));
        System.out.println(mp.size());
        for(String s:mp){
            System.out.println(s);
        }

    }
}
