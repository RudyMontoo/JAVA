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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root==null)return new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int dir=0;
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> lev=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode curr=q.poll();
                lev.add(curr.val);
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }

            }
            if(dir%2!=0){
                Collections.reverse(lev);
            }
            dir++;
            ans.add(lev);
        }
        return ans;
    }
}