package HASHMAP.Coolission;

import java.util.*;

public class Sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> list =new ArrayList<>(map.entrySet());
//        SORTING BY VALUE
//        list.sort((a,b)->a.getValue()-b.getValue());
        //reverse
        list.sort((a,b)->a.getValue()-b.getValue());

        System.out.println(list);
        //in place of getvalue if you write getkey it will sort by key
    }
}
