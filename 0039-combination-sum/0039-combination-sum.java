class Solution {
   final  List<List<Integer>> result=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int trg) {
        // Arrays.sort(candidates);
        func(0,0,candidates, trg, new ArrayList<>());
        return result;
    }

    public void func(int i, int sum, int[] num, int trg, List<Integer> list){
        if(sum==trg){result.add(new ArrayList<>(list));
        return;}
        if(i==num.length || sum>trg)return;
        // tk
        list.add(num[i]);
        func(i, sum+num[i],num,trg,list);

        // ntk
         list.remove(list.size()-1);
         func(i+1, sum,num,trg,list);
        return;
        
    }
}