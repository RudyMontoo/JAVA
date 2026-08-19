class Solution {
   final  List<List<Integer>> result=new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int trg) {
        Arrays.sort(candidates);
        func(0,0,candidates, trg, new ArrayList<>());
        return result;
    }

    public void func(int idx, int sum, int[] num, int trg, List<Integer> list){
        if(sum==trg){
           
            result.add(new ArrayList<>(list));
            
        return;}
        if(idx==num.length || sum>trg)return;
        // tk
        for(int i=idx;i<num.length;i++){
            if(i!=idx && num[i]==num[i-1])continue;

            list.add(num[i]);
            func(i+1, sum+num[i],num,trg,list);

        // ntk
            list.remove(list.size()-1);
            // func(i+1, sum,num,trg,list);
        }
        return;
        
    }
}