package OOPS.properties.EXCESS;

public class a {
    private int num;
    public String name;
    int[] arr;
    // as we known we cannot accesss from the the private in another file but we can access at that file in which private existe like this file

//getter ::: getter mein value daal diya private ka aur getter setter se iss value ka use kr skte hai
    public int getNum() {
        return num;
    }
    //setter
    public void setNum(int num) {
        this.num = num;
    }
    //above things are data members

    public a(int num, String name){
        this.num=num;
        this.name=name;
        this.arr=new int[num];
    }
}
