package leetcode;

import java.util.Scanner;

public class June17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        long k=sc.nextLong();
        System.out.println(processStr(s, k));
    }
        public static char processStr(String s, long k) {
            // SINCE IN THIS QUESTION CONSTRAIN IS HIGH SO WE CANNOT DIRECTLY DO THIS QUESTION BY ITERATION

            // Also not able to manage the resultent

            // =>>>> we have to do without finding result

            long len=0;
            for(int i=0;i<s.length();i++){
                char c = s.charAt(i);

                if (c == '*') {
                    len = Math.max(0L, len - 1);
                } else if (c == '#') {
                    len *= 2;
                } else if (c == '%') {
                    // do nothing
                } else {
                    len++;
                }
            }


            if (k >= len) return '.';

            for (int i = s.length() - 1; i >= 0; i--) {
                char c = s.charAt(i);

                if (c == '#') {
                    len /= 2;
                    if (k >= len) k -= len;
                }
                else if (c == '*') {
                    len++;
                }
                else if (c == '%') {
                    k = len - 1 - k;
                }
                else {
                    len--;
                    if (len == k) return c;
                }
            }

            return '.';

        }

}
