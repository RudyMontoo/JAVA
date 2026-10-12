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
    int idx=0;
     public TreeNode deserialize(String data) {
        String[] s = data.trim().split(" ");
        idx = 0;
        return buildTree(s);
    }

    private TreeNode buildTree(String[] s) {
        if (s[idx].equals("null")) {
            idx++;
            return null;
        }

        TreeNode root = new TreeNode(Integer.parseInt(s[idx++]));

        root.left = buildTree(s);
        root.right = buildTree(s);

        return root;
    }

    

}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));