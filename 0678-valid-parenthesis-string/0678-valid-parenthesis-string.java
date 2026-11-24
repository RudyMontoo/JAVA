class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> stack = new Stack<>();
        // int star=0;  this is problem as we are not seeing star positin for eg "* (" is not valid
        Stack<Integer> star = new Stack<>();
        for (int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){
                stack.push(i);
            }
            else if(c=='*'){
                star.push(i);
            }
            else if(c==')'){
                if(!stack.isEmpty()){
                    stack.pop();
                }
                else if(!star.isEmpty()){
                    star.pop();
                }
                else return false;
            }
        }
        while(!stack.isEmpty() && !star.isEmpty()){
            if(stack.pop()>star.pop())return false;
        }
        return stack.isEmpty();
    }
}