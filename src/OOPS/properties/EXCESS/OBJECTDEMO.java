package OOPS.properties.EXCESS;

public class OBJECTDEMO {
    int num;


    public OBJECTDEMO(int num) {
        this.num=num;
    }
    //already cover these two
//    @Override
//    public String toString() {
//        return super.toString();
//    }
//
//    @Override
//    protected void finalize() throws Throwable {
//        super.finalize();
//    }


    //we will go in detail how to create it in hashmap lecture

    @Override
    public int hashCode() {
//        return super.hashCode();
        return num;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        OBJECTDEMO obj=new OBJECTDEMO(19);
        System.out.println(obj.hashCode());
        OBJECTDEMO obj2=new OBJECTDEMO(19);
        System.out.println(obj2.hashCode());
    }


}
