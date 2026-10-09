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
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> list=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);

        // as we known that we can not go upward in tree so we store parent value by which we are able to go upward in the tree (BFS)

        HashMap<TreeNode,TreeNode> par=new HashMap<>();
        while(!q.isEmpty()){
            TreeNode curr=q.poll();
            // if(!map.containsKey(curr))

            if(curr.left!=null){
                q.add(curr.left);
                par.put(curr.left, curr); 
            }
            if(curr.right!=null){
                q.add(curr.right);
                par.put(curr.right, curr); 
            }
        }

        // NOW LETS FIND THE VALUE 
         Queue<TreeNode> q1=new LinkedList<>();
         q1.add(target);
         HashSet<TreeNode> visited=new HashSet<>();
        visited.add(target);
         while(k>0 && !q1.isEmpty()){
            int size=q1.size();
            for(int i=0;i<size;i++){
            TreeNode curr=q1.poll();
            TreeNode p=par.get(curr);
            if(p!=null && !visited.contains(p)){
                q1.add(p);
                visited.add(p);
            }
            if(curr.left!=null && !visited.contains(curr.left)){
                q1.add(curr.left);
                visited.add(curr.left);
            }
            if(curr.right!=null && !visited.contains(curr.right)){
                q1.add(curr.right);
                visited.add(curr.right);
            }
            }
            k--;

         }

        while(!q1.isEmpty()){
            list.add(q1.poll().val);
         }
         return list;
        
    }
   
}