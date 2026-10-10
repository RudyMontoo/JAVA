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
//  you can do by recusion  expo
// you can do by bfs O(n)
// for less than O(n)
class Solution {
    public int countNodes(TreeNode root) {
        if(root==null)return 0;
        int lh=heightleft(root);
        int rh=heightright(root);
        if(lh==rh){
            return (int)Math.pow(2,lh)-1;
        }
        return 1+countNodes(root.left)+countNodes(root.right);
        
    }
    public int heightleft(TreeNode root){
        if(root==null)return 0;
        int count=0;
        while(root!=null){
            root=root.left;
            count++;
        }
        return count;
    }
    public int heightright(TreeNode root){
        if(root==null)return 0;
        int count=0;
        while(root!=null){
            root=root.right;
            count++;
        }
        return count;
    }
}