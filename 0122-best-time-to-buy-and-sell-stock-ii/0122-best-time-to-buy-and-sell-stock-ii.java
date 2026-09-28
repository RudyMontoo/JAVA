class Solution {
    public int maxProfit(int[] prices) {
        int buy=prices[0];
        int total=0;
        int maxpf=0;


        for(int i=1;i<prices.length;i++){
            int pf=prices[i]-buy;
            if(pf>=0){
                total+=pf;
                pf=0;
                buy=prices[i];
            }
            else{
                buy=prices[i];
            }
        }
        return total;
    }
}