package ESEOOPS.Problem7;
import java.util.*;
public class LESA {
    public static void main(String[] args){

        List<Integer> list=new ArrayList<>();
        for(int i=0;i<10;i++){
            list.add(i);
        }
        list.stream().filter(n->n%2==0).forEach(System.out::println);
    }
}
