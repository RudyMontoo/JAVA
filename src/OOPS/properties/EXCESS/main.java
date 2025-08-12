package OOPS.properties.EXCESS;

public class main {
    public static void main(String[] args) {
        a object=new a(10,"rudra");
        //need to do few things
        //1 access the data members
        //2 modify the data members
       // object.num;//error
        //this give me error because num is private
        // how u can tackle this by getter andd settter
        //getter it get the value from the private
        // setter it set the value

        object.getNum();
    }
}
