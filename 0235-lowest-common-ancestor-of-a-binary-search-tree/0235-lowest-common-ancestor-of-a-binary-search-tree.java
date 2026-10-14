/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // same code that we use in binary tree
        // if(root==null || root==p || root==q)return root;
        // TreeNode a=lowestCommonAncestor(root.left,p,q);
        // TreeNode b=lowestCommonAncestor(root.right,p,q);
        // if(a!=null && b!=null)return root;
        // return a!=null?a:b;

        // Its Code
        if(root==null|| root==p || root==q)return root;
        if(root.val>p.val && root.val>q.val)return lowestCommonAncestor(root.left,p,q);
        else if(root.val<p.val && root.val<q.val)return lowestCommonAncestor(root.right,p,q);
        // root.val>p.val && root.val<q.val  => our answer return root;
        return root;
    }
}