package rudra;

public class code4typeconversion {
    public static void main(String[] args) {
//        float a=567.777f;
//        int b=(int)a;
//        System.out.println(b);
//
//        char c='b';
//        int d=(int)c;
//        System.out.println(d);

        //type promotion
        byte b = 42;
        char c= 'a';
        short s = 102;
        int i = 5000 ;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f*b) + (i / c)-(d*s);
// float + int - double = double
        System.out.println((f*b) + " " + (i / c) + " " + (d*s));
        System.out.println(result);
    }
}
