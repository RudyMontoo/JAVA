/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

// Problem kahan hai? Constructor mein hum poora tree list mein bhar dete hain, jabki user ko abhi sirf agla element chahiye. Isse O(n) memory lagti hai.

// Idea: "Lazy" inorder. Poora inorder pehle se mat nikalo. Bas utna hi nikalo jitna next() ko chahiye, aur beech ka raasta stack mein yaad rakho.

// class BSTIterator {
//     // TIME COMPLEXITY WITH THIS CODE IS O(N)
//     TreeNode pointer=null;
//     List<Integer> list=new ArrayList<>();
//     int idx=0;
//     public BSTIterator(TreeNode root) {
//         inorder(root);
//     }
    
//     public int next(){
//         return list.get(idx++);
//     }
    
//     public boolean hasNext(){
//         if(list.size()>=idx+1){
//             return true;
//         }
//         return false;
//     }

//     public void inorder(TreeNode root){
//         if(root==null)return;
//         inorder(root.left);
//         list.add(root.val);
//         inorder(root.right);
//     }
// }


// METHOD 2 
class BSTIterator{
    // TIME COMPLEXITY WITH THIS CODE IS O(h)
    Stack<TreeNode> st=new Stack<>();
    public BSTIterator(TreeNode root){
        pushLeft(root);
    }
    public void pushLeft(TreeNode root){
        if(root==null)return;
        while(root!=null){
            st.push(root);
            root=root.left;
        }
    }
    
    public int next(){
        TreeNode node=st.pop();
        if(node.right!=null)pushLeft(node.right);
        return node.val;

    }
    
    public boolean hasNext(){
        if(!st.isEmpty())return true;
        return false;
    }

    
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */