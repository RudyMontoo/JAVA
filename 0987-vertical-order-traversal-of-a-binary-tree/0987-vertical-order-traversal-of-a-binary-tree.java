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
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        if(root==null)return list;
        TreeMap<Integer,List<Integer>> map=new TreeMap<>();
        Queue<TreeNode> q=new LinkedList<>();
        Queue<Integer> col=new LinkedList<>();
        q.add(root);
        col.add(0);

        while(!q.isEmpty()){
            int size=q.size();
            Map<Integer,List<Integer>> levelMap=new HashMap<>();
            for(int i=0;i<size;i++){
            TreeNode curr=q.poll();
            int k=col.poll();

            if(!levelMap.containsKey(k)){
                levelMap.put(k,new ArrayList<>());
            }
            levelMap.get(k).add(curr.val);

            if(curr.left!=null){
                q.add(curr.left);
                col.add(k-1);
            }
            if(curr.right!=null){
                q.add(curr.right);
                col.add(k+1);
            }
            }
             for(int c: levelMap.keySet()){
                List<Integer> vals=levelMap.get(c);
                Collections.sort(vals);
                if(!map.containsKey(c)){
                    map.put(c,new ArrayList<>());
                }
                map.get(c).addAll(vals);
            }
        }
         

        for(var key: map.keySet()){
            list.add(map.get(key));
        }

        return list;
    }
}