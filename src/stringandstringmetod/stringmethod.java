package stringandstringmetod;
import java.util.Arrays;
import java.util.Locale;

public class stringmethod {
    public static void main(String[] args) {
        System.out.println("String method");
        String name="Rudra Sharma";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.length());
        System.out.println(name.charAt(0));
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
    }
}
