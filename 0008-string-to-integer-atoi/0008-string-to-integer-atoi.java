// BY BRUTE FORCE
// class Solution {
//     public int myAtoi(String s) {
//         StringBuilder sb = new StringBuilder();

//         boolean found = false;
//         boolean signFound = false;
//         int sign = 1;

//         for (int i = 0; i < s.length(); i++) {
//             char a = s.charAt(i);

//             // Leading spaces
//             if (a == ' ') {
//                 if (found || signFound)
//                     break;
//                 else
//                     continue;
//             }

//             // Sign
//             else if (a == '-' || a == '+') {
//                 if (signFound || found)
//                     break;

//                 signFound = true;

//                 if (a == '-')
//                     sign = -1;
//             }

//             // Digit
//             else if (a >= '0' && a <= '9') {
//                 sb.append(a);
//                 found = true;
//             }

//             // Anything else
//             else {
//                 break;
//             }
//         }

//         if (sb.length() == 0)
//             return 0;

//         long num = 0;

//         for (int i = 0; i < sb.length(); i++) {
//             int digit = sb.charAt(i) - '0';

//             num = num * 10 + digit;

//             if (sign == 1 && num > Integer.MAX_VALUE)
//                 return Integer.MAX_VALUE;

//             if (sign == -1 && -num < Integer.MIN_VALUE)
//                 return Integer.MIN_VALUE;
//         }

//         return (int)(sign * num);
//     }
// }


// BY RECURSIVE METHOD
class Solution {
    StringBuilder sb = new StringBuilder();
    int sign = 1;
    boolean found = false;

    public int myAtoi(String s) {
        func(0, s, sb);

        long num = 0;

        for (int i = 0; i < sb.length(); i++) {
            int digit = sb.charAt(i) - '0';

            num = num * 10 + digit;

            if (sign == 1 && num > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;

            if (sign == -1 && -num < Integer.MIN_VALUE)
                return Integer.MIN_VALUE;
        }

        return (int) (sign * num);
    }

    public void func(int i, String s, StringBuilder sb) {

        if (i == s.length()) {
            return;
        }

        // Skip leading spaces
        if (s.charAt(i) == ' ' && !found) {
            func(i + 1, s, sb);
            return;
        }

        // Handle sign
        if ((s.charAt(i) == '-' || s.charAt(i) == '+') && !found) {

            if (s.charAt(i) == '-') {
                sign = -1;
            }

            found = true;
            func(i + 1, s, sb);
            return;
        }

        // Stop at first non-digit
        if (!Character.isDigit(s.charAt(i))) {
            return;
        }

        found = true;

        sb.append(s.charAt(i));

        func(i + 1, s, sb);

       
    }
}