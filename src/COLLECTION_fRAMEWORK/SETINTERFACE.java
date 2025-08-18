package COLLECTION_fRAMEWORK;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class SETINTERFACE {
    public static void main(String[] args) {
//        HashSet<Integer> set=new HashSet<>();
//        //unordered unique
//        set.add(1);
//        set.add(2);
//        set.add(3);
//        System.out.println(set);
//        set.add(1);
//        set.add(2);
//        set.add(48);
//        set.add(15);
//        System.out.println(set);


//        //Linked hashset
//        LinkedHashSet<Integer> set=new LinkedHashSet<>();
//        //ordered unique + linked
//        set.add(1);
//        set.add(2);
//        set.add(3);
//        System.out.println(set);
//        set.add(1);
//        set.add(2);
//        set.add(48);
//        set.add(15);
//        System.out.println(set);
//

        //Sorted set
        TreeSet<Integer> set=new TreeSet<>();

        //sorted unique tree
        set.add(1);
        set.add(2);
        set.add(3);
        System.out.println(set);
        set.add(1);
        set.add(2);
        set.add(48);
        set.add(15);
        System.out.println(set);
    }
}
