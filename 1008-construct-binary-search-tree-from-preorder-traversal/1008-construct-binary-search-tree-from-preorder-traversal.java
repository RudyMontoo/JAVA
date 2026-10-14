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
class Solution {
    int idx=0;
    public TreeNode bstFromPreorder(int[] preorder) {
        return func(Integer.MAX_VALUE,preorder);
    }
    public TreeNode func(int ub,int[] preorder){
        if(idx==preorder.length || preorder[idx]>ub)return null;
        TreeNode node=new TreeNode(preorder[idx++]);
        node.left= func(node.val,preorder);
        node.right=func(ub,preorder);
       return node;
    }
}