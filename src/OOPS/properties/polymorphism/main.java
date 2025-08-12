package OOPS.properties.polymorphism;

public class main {
    public static void main(String[] args) {

        shape  s = new shape();
        triangle tri = new triangle();
        square  sq = new square();
        circle c = new circle();

        s.area();
        tri.area();
        sq.area();
        c.area();
    }
}
