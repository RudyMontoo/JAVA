class Solution {
    List<List<Integer>> result=new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n){
        func(1,0,k,n,new ArrayList<>());  //n is trg 
        return result;
    }
    public void func(int idx, int sum,int k, int trg, List<Integer> list){
        if(list.size()==k && sum==trg){
            if(!result.contains(list)){
            result.add(new ArrayList<>(list));
           
            }
             return;
        }

        for(int i=idx;i<=9;i++){
            // take
            
            list.add(i);
            func(i+1,sum+i,k,trg,list);

            // not take
            list.remove(list.size()-1);
            func(i+1,sum,k,trg,list);
        }

        return;
    }
}