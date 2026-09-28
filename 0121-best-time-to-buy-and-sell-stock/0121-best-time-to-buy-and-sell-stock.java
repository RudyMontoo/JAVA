class Solution {
    public int maxProfit(int[] prices) {
        // // method 1 recursion

        // return func(n-1, prices);

        int maxpf=0;
        int buy=prices[0];

        for(int i=1;i<prices.length;i++){
            int pf=prices[i]-buy;
            maxpf=Math.max(pf,maxpf);
            
            buy=Math.min(prices[i],buy);
        }
        return maxpf;
    }

   
}