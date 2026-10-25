class Solution {
    public int countStaircase(int[] nums) {
        int n=nums.length;
        int ans=0;
        for(int i=0;i<n;i++){
        LinkedHashMap<Integer,Integer> freq=new LinkedHashMap<>();
        LinkedHashMap<Integer,Integer> rnk=new LinkedHashMap<>();
        int distinct=0;
        int good=0;
        for(int j=i;j<n;j++){
            int x=nums[j];
            if(!freq.containsKey(x)){
                distinct++;
                freq.put(x,1);
                rnk.put(x,distinct);
                if(distinct==1)good++;
            }
            else{
                int f=freq.get(x)+1;
                int r=rnk.get(x);
                freq.put(x,f);
                if(f>r)break;
                if(f==r)good++;
            }
            if(good==distinct) ans++;
        }
        
        }
        return ans;
    }
}