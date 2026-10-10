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
    int preidx=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return func(0,inorder.length-1,inorder,preorder);
    }
    public TreeNode func(int i, int j,int[] inorder, int[] preorder){
        if(i>j)return null;
        int mid=preorder[preidx++];
        TreeNode root=new TreeNode(mid);
        for(int k=i;k<=j;k++){
             if(inorder[k]==mid){
                    root.left=func(i,k-1,inorder,preorder);
                    root.right=func(k+1,j,inorder,preorder);
                    break;
                }
        }
        return root;
    }
}