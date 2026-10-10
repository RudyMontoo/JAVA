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
    int posIdx=0;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        posIdx=inorder.length-1;
        return func(0,inorder.length-1,inorder, postorder);
    }
    public TreeNode func(int i, int j, int[] inorder, int[] postorder){
        if(i>j)return null;
        int mid=postorder[posIdx--];
        TreeNode root=new TreeNode(mid);
        for(int k=i;k<=j;k++){
            if(inorder[k]==mid){
                root.right=func(k+1,j,inorder,postorder);
                root.left=func(i,k-1,inorder,postorder);
                
                break;
            }
        }
        return root;
    }
}