package leetcode;
import java.util.*;
public class june22 {
    public static void main(String[] args) {
        String text="loonbalxballpoon";
        System.out.println(maxNumberOfBalloons(text));
    }
    public static int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(var x:text.toCharArray()){
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        // "balloon"
        int b = map.getOrDefault('b', 0);
        int a = map.getOrDefault('a', 0);
        int l = map.getOrDefault('l', 0) / 2;
        int o = map.getOrDefault('o', 0) / 2;
        int n = map.getOrDefault('n', 0);

        return Math.min(b,
                Math.min(a,
                        Math.min(l,
                                Math.min(o, n))));
    }
}
