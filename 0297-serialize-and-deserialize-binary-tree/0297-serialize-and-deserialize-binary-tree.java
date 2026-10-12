/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
    
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb=new StringBuilder();
        preorder(root,sb);
        return sb.toString();
    }
    public void preorder(TreeNode root, StringBuilder sb){
        if(root==null){sb.append("null").append(" ");
        return;}
        sb.append(root.val).append(" ");
        preorder(root.left,sb);
        preorder(root.right,sb);
    }

    // Decodes your encoded data to tree.
   
    public TreeNode deserialize(String data) {
        String[] s = data.trim().split("\\s+");
        int[] index = {0};
        return buildTree(s, index);
    }

    private TreeNode buildTree(String[] s, int[] index) {
        if (s[index[0]].equals("null")) {
            index[0]++;
            return null;
        }

        TreeNode root = new TreeNode(Integer.parseInt(s[index[0]++]));

        root.left = buildTree(s, index);
        root.right = buildTree(s, index);

        return root;
    }

    

}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));