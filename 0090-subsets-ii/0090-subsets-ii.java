class Solution {
    final List<List<Integer>> result=new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] num) {
        Arrays.sort(num);
        func(0,num,new ArrayList<>());
        return result;
    }

     public  void func(int i, int[] num, List<Integer> list){
        if(i==num.length){
            if(check(list,result)){
            result.add(new ArrayList<>(list));
            }
        return; 
        }
        // take
        
        list.add(num[i]);
        func(i+1,num,list);
        

        
        // not take 
       list.remove(list.size() - 1);
        func(i+1,num,list);
        return;


    }

    public boolean check(List<Integer> list, List<List<Integer>> result) {
    return !result.contains(list);
}
}