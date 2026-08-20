class Solution {
    public int[] resultArray(int[] nums) {
        // METHOD 1 two pointer 
        int n=nums.length;
        int alast=0;
        int blast=0;
        List<Integer> a=new ArrayList<>();
        List<Integer> b=new ArrayList<>();
        a.add(nums[0]);
        b.add(nums[1]);
        int i=2;
        while(i<n){
            if(a.get(a.size()-1)>b.get(b.size()-1))a.add(nums[i]);
        else b.add(nums[i]);

        i++;
        }
        
        a.addAll(b);
        int[] arr = a.stream()
             .mapToInt(Integer::intValue)
             .toArray();

        return arr;
    }
}