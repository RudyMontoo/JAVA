package OOPS.lecture6;

import java.util.ArrayList;

public class lambda_function {
//    lambda function is an inline function
public static void main(String[] args) {
    ArrayList<Integer> list=new ArrayList<Integer>();
    for(int i=0;i<5;i++){
        list.add(i+1);
    }
    list.forEach((item) -> System.out.println(item +2));

}
}
