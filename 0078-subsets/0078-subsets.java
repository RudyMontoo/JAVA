class Solution {
    final  List<List<Integer>> result=new ArrayList<>();
    public List<List<Integer>> subsets(int[] num){
       
        func(0,num,new ArrayList<>());
        return result; 
    }

    public  void func(int i, int[] num, List<Integer> list){
        if(i==num.length){result.add(new ArrayList<>(list));
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
}