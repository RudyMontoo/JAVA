class Solution {
    static final long MOD = 1_000_000_007;

    public int countGoodNumbers(long n) {
        long even = power(5, (n + 1) / 2);
        long odd = power(4, n / 2);

        return (int) ((even * odd) % MOD);
    }

    public long power(long base, long exp) {
        long ans = 1;

        while (exp > 0) {
            if (exp % 2 == 1) {
                ans = (ans * base) % MOD;
            }

            base = (base * base) % MOD;
            exp = exp / 2;
        }

        return ans;
    }
}