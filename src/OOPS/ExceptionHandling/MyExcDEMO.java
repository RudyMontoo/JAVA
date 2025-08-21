package OOPS.ExceptionHandling;

public class MyExcDEMO {
    public static void main(String[] args) {
        try {
            String name ="Rudra";
            if(name.equals("Rudra")){
                throw new MyException("Name is Rudra ");
            }
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}
