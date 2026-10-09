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
//     public int widthOfBinaryTree(TreeNode root) {
//         if (root == null) return 0;

//         Queue<TreeNode> q = new LinkedList<>();
//         Queue<Long> idx = new LinkedList<>();

//         q.offer(root);
//         idx.offer(0L);

//         long ans = 0;

//         while (!q.isEmpty()) {
//             int size = q.size();
//             long mmin = idx.peek();
//             long first = 0, last = 0;

//             for (int i = 0; i < size; i++) {
//                 TreeNode curr = q.poll();
//                 long index = idx.poll() - mmin;

//                 if (i == 0) first = index;
//                 if (i == size - 1) last = index;

//                 if (curr.left != null) {
//                     q.offer(curr.left);
//                     idx.offer(2 * index + 1);
//                 }

//                 if (curr.right != null) {
//                     q.offer(curr.right);
//                     idx.offer(2 * index + 2);
//                 }
//             }

//             ans = Math.max(ans, last - first + 1);
//         }

//         return (int) ans;
//     }
// }



// insetad of using two queue everytime u can make object also 
// METHOD 2
class Pair{
    TreeNode node;
    long num ;
    Pair(TreeNode node, long num){
        this.node=node;
        this.num=num;
    }
}

class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) return 0;

        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(root,0));

        long ans = 0;

        while (!q.isEmpty()){
            int size = q.size();
            long mmin = q.peek().num;
            long first = 0, last = 0;

            for (int i = 0; i < size; i++) {
                // twice polling from queue
                // TreeNode curr = q.poll().node;
                // long index = q.poll().num - mmin;

                Pair p = q.poll();
                TreeNode curr = p.node;
                long index = p.num - mmin;

                if (i == 0) first = index;
                if (i == size - 1) last = index;

                if (curr.left != null) {
                    q.offer(new Pair(curr.left,2 * index + 1));
                }

                if (curr.right != null) {
                    q.offer(new Pair(curr.right,2 * index + 2));
                }
            }

            ans = Math.max(ans, last - first + 1);
        }

        return (int) ans;
    }
}