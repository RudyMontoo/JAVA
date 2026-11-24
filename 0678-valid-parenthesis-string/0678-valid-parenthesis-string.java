// // METHOD 1 TWO STACK
// class Solution {
//     public boolean checkValidString(String s) {
//         Stack<Integer> stack = new Stack<>(); //storing position
//         // int star=0;  this is problem as we are not seeing star positin for eg "* (" is not valid
//         Stack<Integer> star = new Stack<>();  //storing position
//         for (int i=0;i<s.length();i++){
//             char c=s.charAt(i);
//             if(c=='('){
//                 stack.push(i);
//             }
//             else if(c=='*'){
//                 star.push(i);
//             }
//             else if(c==')'){
//                 if(!stack.isEmpty()){
//                     stack.pop();
//                 }
//                 else if(!star.isEmpty()){
//                     star.pop();
//                 }
//                 else return false;
//             }
//         }
//         while(!stack.isEmpty() && !star.isEmpty()){
//             if(stack.pop()>star.pop())return false;
//         }
//         return stack.isEmpty();
//     }
// }

// METHOD 2 GREEDY SEARCH  instead of mainting count -> maintain range
// METHOD 2 GREEDY - maintain range (minOpen, maxOpen)
class Solution {
    public boolean checkValidString(String s) {
        int minOpen = 0; // minimum possible open brackets (treat * as ')')
        int maxOpen = 0; // maximum possible open brackets (treat * as '(')

        for (char c : s.toCharArray()) {
            if (c == '(') {
                minOpen++;
                maxOpen++;
            } else if (c == ')') {
                minOpen--;
                maxOpen--;
            } else { // '*'
                minOpen--;  // treat * as ')'
                maxOpen++;  // treat * as '('
            }

            if (maxOpen < 0) return false; // too many ')' even in best case
            minOpen = Math.max(minOpen, 0); // can't have negative open brackets
        }

        return minOpen == 0;
    }
}
