package OOPS.properties.polymorphism;

public class numbers {
    int sum(int a,int b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        numbers obj=new numbers();
        System.out.println(obj.sum(1,2));
        System.out.println(obj.sum(1,2,3));


    }
}
