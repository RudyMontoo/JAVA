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

//  
class Solution {
    public int maxPathSum(TreeNode root) {
        if(root==null)return Integer.MIN_VALUE;;
        int left=Integer.MIN_VALUE;
        int right=Integer.MIN_VALUE;
        if(root.left!=null){
            left=maxPathSum(root.left);
        }
        if(root.right!=null){
            right=maxPathSum(root.right);
        }
                int leftSum = Math.max(0, sum(root.left));
        int rightSum = Math.max(0, sum(root.right));

        int throughRoot = root.val + leftSum + rightSum;

        return Math.max(throughRoot, Math.max(left, right));

    }
    
   public int sum(TreeNode root) {
    if(root == null) return 0;

    return root.val + Math.max(0,
        Math.max(sum(root.left), sum(root.right))
    );
}
}