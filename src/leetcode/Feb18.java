package leetcode;

public class Feb18 {

    public static void main(String[] args) {
        int n = 5;   // change value to test

        while (n > 0) {
            int a = n & 1;
            int b = (n >> 1) & 1;
            n = n >> 1;

            if (a == b) {
                System.out.println(false);
                return;
            }
        }

        System.out.println(true);
    }
}
