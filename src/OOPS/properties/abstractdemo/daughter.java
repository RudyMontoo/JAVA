package OOPS.properties.abstractdemo;

public class daughter extends parent{
    @Override
    void career(String name) {
        System.out.println("I want to become a "+name);
    }

    @Override
    void age(int age) {
        System.out.println("My age is "+age);
    }

    @Override
    void patner(String name) {
        System.out.println("I want to marray with "+name);
    }
}
