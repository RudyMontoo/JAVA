package leetcode;

import java.util.Scanner;

public class Feb19 {

    public static int countBinarySubstrings(String s) {

        int ans = 0;
        int curr = 1;   // current group length
        int prev = 0;   // previous group length

        for (int i = 1; i < s.length(); i++) {

            if (s.charAt(i) == s.charAt(i - 1)) {
                curr++;
            } else {
                ans += Math.min(prev, curr);
                prev = curr;
                curr = 1;
            }
        }

        return ans + Math.min(prev, curr);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int result = countBinarySubstrings(s);

        System.out.println(result);

        sc.close();
    }
}
