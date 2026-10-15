class Solution {
    public int sumCounts(List<Integer> nums) {
        int n=nums.size();
        int sum=0;
        for(int w=0;w<n;w++){
        for(int i=0;i<n-w;i++){
            HashSet<Integer> set=new HashSet<>();
            for(int j=i;j<=i+w;j++){
                set.add(nums.get(j));
            }
            sum+=(int)Math.pow(set.size(),2);
        }
        }
        return sum;
    }
}