package leetcode;

public class Feb16 {

    public static void main(String[] args) {

        int n = 874757;   // example input
        int result = 0;

        for (int i = 0; i < 32; i++) {
            result <<= 1;          // shift result left
            result |= (n & 1);     // take last bit of n and add to result
            n >>= 1;               // shift n right
        }

        System.out.println(result);
    }
}