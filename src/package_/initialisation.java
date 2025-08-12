package package_;

public class initialisation {
    static int a=6;
    static int b;
    //WILL ONLY RUN ONCE, WHEN THE FIRST OBJECT IS CREATE I.E. WHEN THE CLOSE IS LOADED FOR THE FIRST TIME
    static{
        System.out.println("Inside initialisation");
        b=a*5;

    }

    public static void main(String[] args) {
        initialisation obj=new initialisation();
        System.out.println(initialisation.a+ " " + initialisation.b);
    initialisation.b+=3;
        System.out.println(initialisation.a+ " " + initialisation.b);

        initialisation obj2=new initialisation();
        System.out.println(initialisation.a+ " " + initialisation.b);
    }
}
