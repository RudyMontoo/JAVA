class Solution {
    public String maxSumOfSquares(int num, int sum) {
        int start = (num == 1) ? 0 : (int) Math.pow(10, num - 1); // num digits ka sabse chhota number
        int end = (int) Math.pow(10, num);                        // num digits ka sabse bada number + 1
        int msum = -1;        // -1 rakha taaki pehla valid number accept ho jaye
        String ans = "-1";    // koi number na mile toh "-1" return hoga

        for (int x = start; x < end; x++) {
            int n = x;
            int tsum = 0;
            int dsum = 0;
            while (n > 0) {
                int d = n % 10;
                dsum += d * d;
                tsum += d;
                n /= 10;
            }
            if (tsum == sum && dsum >= msum) {
                msum = dsum;
                ans = String.valueOf(x);
            }
        }
        return ans;
    }
}