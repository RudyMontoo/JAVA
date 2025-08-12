package recursion;

import java.util.Scanner;

public class COUNTZEROESINTHENUM {

        static int counting(int n) {
            if (n == 0) {
                return 0;
            }
            int count = (n % 10 == 0) ? 1 : 0;
            return count + counting(n / 10);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result=counting(n);
        System.out.println(result);
    }
}
