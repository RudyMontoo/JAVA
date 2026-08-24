class Solution {
    public int divide(int dividend, int divisor) {

        if (dividend == divisor)
            return 1;

        boolean sign = false;

        if ((dividend > 0 && divisor < 0) ||
            (dividend < 0 && divisor > 0)) {
            sign = true;
        }

        long quo = Math.abs((long) dividend);
        long div = Math.abs((long) divisor);

        long ans = 0;

        while (quo >= div) {

            int i = 0;
            long n = div;

            while ((n << 1) <= quo) {
                n = n << 1;
                i++;
            }

            quo = quo - n;
            ans += (1L << i);
        }

        if (sign)
            ans = -ans;

        if (ans > Integer.MAX_VALUE)
            return Integer.MAX_VALUE;

        if (ans < Integer.MIN_VALUE)
            return Integer.MIN_VALUE;

        return (int) ans;
    }
}