class Solution {
    public int minBitFlips(int start, int goal) {
        if(start==goal)return 0;
        int count=0;
        int ans=start^goal;
        return Integer.bitCount(ans);
    }
}