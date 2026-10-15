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
    List<TreeNode> list=new ArrayList<>();
    
    public void recoverTree(TreeNode root){
        if(root==null)return;
        inorder(root);
        List<TreeNode> list2=new ArrayList<>(list);
        Collections.sort(list, (a, b) -> Integer.compare(a.val, b.val));
        for(int i=0;i<list.size();i++){
            if(list.get(i)!=list2.get(i)){swap(list.get(i),list2.get(i));
            return;}
        }
    }
    public void  inorder(TreeNode root){
        if(root==null)return;
        inorder(root.left);
        list.add(root);
        inorder(root.right);
    }
    public void swap(TreeNode a, TreeNode b){
        int temp=a.val;
        a.val=b.val;
        b.val=temp;
    }
}