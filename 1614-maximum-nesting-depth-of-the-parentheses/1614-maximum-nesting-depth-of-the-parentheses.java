class Solution {
    public int maxDepth(String s) {
        int balance=0;
        int ans=0;
        int k=0;
        for(char c:s.toCharArray()){
             if(c=='('){
                balance++;
                ans=Math.max(ans, balance);
             }
             if(c==')'){
                balance--;
             }
        }
        return ans;


    }
}