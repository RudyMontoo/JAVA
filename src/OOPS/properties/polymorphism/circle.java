package OOPS.properties.polymorphism;

public class circle extends shape{

    // this will run when obj of circle is creaated
        //hence it is overriding the parent method;
    @Override//this is clled annotion
    void area(){
        System.out.println("area=pi*r*r");
    }
}
