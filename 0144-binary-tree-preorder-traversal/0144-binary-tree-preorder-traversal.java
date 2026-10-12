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
// class Solution {
//     public List<Integer> preorderTraversal(TreeNode root) {
//       List<Integer> list=new ArrayList<>();
//       po(root,list);
//       return list;
//     }
//     public void po(TreeNode root, List<Integer> list){
//         if(root==null)return;
//       list.add(root.val);
//       po(root.left, list);
//       po(root.right,list);
//     }
// }

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        TreeNode curr=root;
        while(curr!=null){
            // case 1
            ans.add(curr.val);
            if(curr.left==null){
                curr=curr.right;
            }
            else{
                TreeNode prev=curr.left;
                while(prev.right!=null &&  prev.right!=curr){
                    prev=prev.right;
                }
                if(prev.right==null){
                    prev.right=curr.right;
                    curr=curr.left;
                }
                else{
                    prev.right=null;
                    ans.add(curr.val);
                    curr=curr.right;
                }
            }
        }
        return ans;
    }
}