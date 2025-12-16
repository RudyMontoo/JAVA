package ESEOOPS.Problem6;
import java.util.*;
public class LL {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedList<Integer> list=new LinkedList<>();
        for(int i=0;i<10;i++){
            list.add(sc.nextInt());
        }
        for(int i=0;i<5;i++){
            int op=sc.nextInt();
            switch(op){
                case 1:
                    int a=sc.nextInt();
                    list.add(a);
                    break;
                    case 2:
                        list.removeFirst();

                        break;

            }
        }
//        for(int i=0;i<=10;i++){
            System.out.println(list);
//        }
    }
}
