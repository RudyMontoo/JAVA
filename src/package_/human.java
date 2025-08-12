package package_;

public class human {
    int age;
    String name;
    String address;
    static long  Population;


    public human(int age,String name,String address) {
    this.age=age;
    this.name=name;
    this.address=address;
    human.Population+=1;

    }

}
