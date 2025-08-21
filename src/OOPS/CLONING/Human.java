package OOPS.CLONING;

public class Human implements Cloneable {
    int age;
    String name;
    int[] arr;

    public Human(int age,String name){
        this.age=age;
        this.name=name;
        this.arr=new int[]{2,5,9,6,1};
    }

//    public Human(Human other){
//        this.age=other.age;
//        this.name=other.name;
//    }

//    SHALLOW COPY
//    @Override
//    public Object clone() throws CloneNotSupportedException {
////        this is shallow copy
//        return super.clone();
//    }

//    deep copy
    public Object clone() throws CloneNotSupportedException {
        Human twin=(Human)super.clone();//this is actually shallow

        twin.arr=new int[twin.arr.length];
        for(int i=0;i<twin.arr.length;i++){
            twin.arr[i]=arr[i];

        }
        return twin;
    }

}
