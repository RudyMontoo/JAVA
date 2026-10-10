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
//  method 1-> start from right and merge bottom right to up
// class Solution {
//     TreeNode prev=null;
//     public void flatten(TreeNode root) {
//         if(root==null)return ;
//         flatten(root.right);
//         flatten(root.left);
//         root.right=prev;
//         root.left=null;
//         prev=root;
//         return;
//     }
// }

// Method 2-. start from left subtree and right subtree
class Solution {
    public void flatten(TreeNode root) {
        helper(root);
    }

    // flattened chain ka tail return karta hai
    private TreeNode helper(TreeNode node) {
        if (node == null) return null;

        TreeNode leftTail = helper(node.left);
        TreeNode rightTail = helper(node.right);

        if (leftTail != null) {
            leftTail.right = node.right;   // right subtree left chain ke end pe
            node.right = node.left;        // left ko right bana do
            node.left = null;
        }

        if (rightTail != null) return rightTail;
        if (leftTail != null) return leftTail;
        return node;
    }
}