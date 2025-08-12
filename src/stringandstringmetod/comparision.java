package stringandstringmetod;

public class comparision {
    public static void main(String[] args) {
        System.out.println("Comparision");
        System.out.println("method = =");
        String name1="Rudra";
        String name2="Rudra";
        System.out.println(name1==name2);
        String name3=new  String("Rudra");
        String name4=new  String("Rudra");
        System.out.println(name3==name4);


        System.out.println(".equalmethod");
        System.out.println(name1.equals(name2));
        System.out.println(name3.equals(name4));

    }
}
