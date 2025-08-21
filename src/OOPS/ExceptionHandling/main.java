package OOPS.ExceptionHandling;

public class main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
            divide(a, b);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("It always xecutes");
        }
    }
        static int divide(int a,int b) throws ArithmeticException {
        if(b==0){
            throw new ArithmeticException("Division by zero heah heahb ");
        }
        return a/b;
        }

}
