class Solution {
    public String removeOuterParentheses(String s) {
        int n=s.length();
        int balance=0;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){
                if(balance>0){
                
                 sb.append(s.charAt(i));
                }
                balance++;
               
            }
            else{
                balance--;
                if(balance>0){
                   sb.append(s.charAt(i)); 
                }
            }
            
        }
        return sb.toString();

    }
}