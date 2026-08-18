class Solution {
    final List<String> result=new ArrayList<>();
    public List<String> generateParenthesis(int n) {
       func(0,0,"",n);
       return result;
    }
// open bracket ob
// close bracket cb
    public void func(int ob, int cb,  String s,int n){
        if(ob==n && cb==n){
            result.add(s);
            return;
        }
        if(ob<n){
        func(ob+1,cb,s+"(",n);
        }
        if(cb<ob){
        func(ob,cb+1,s+")",n); 
       
        }
         return;
    }
}

// catalan number
// reursive with trunning 