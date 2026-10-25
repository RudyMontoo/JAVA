class Solution {
    public int countStaircase(int[] nums) {
        int n = nums.length, ans = 0;
        int[] freq = new int[100001];
        int[] rnk = new int[100001];
        int[] stamp = new int[100001];   // stamp[x] == i+1 → x seen in current start i

        for (int i = 0; i < n; i++) {
            int distinct = 0, good = 0;
            for (int j = i; j < n; j++) {
                int x = nums[j];
                if (stamp[x] != i + 1) {          // new value for this start
                    stamp[x] = i + 1;
                    distinct++;
                    if (distinct > 315) break;
                    freq[x] = 1;
                    rnk[x] = distinct;
                    if (distinct == 1) good++;
                } else {
                    int f = ++freq[x];
                    if (f > rnk[x]) break;
                    if (f == rnk[x]) good++;
                }
                if (good == distinct) ans++;
            }
        }
        return ans;
    }
}