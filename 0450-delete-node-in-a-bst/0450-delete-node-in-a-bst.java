
class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return null;

        TreeNode parent = null;
        TreeNode curr = root;

        while (curr != null && curr.val != key) {
            parent = curr;

            if (curr.val < key) {
                curr = curr.right;
            } else {
                curr = curr.left;
            }
        }

        if (curr == null) return root;

        // Case 1: No children
        if (curr.left == null && curr.right == null) {
            if (parent == null) return null; // CHANGE: root is a leaf

            if (parent.left == curr) {
                parent.left = null; // CHANGE: check reference
            } else {
                parent.right = null;
            }
        }

        // Case 2: Only left child
        else if (curr.left != null && curr.right == null) {
            if (parent == null) return curr.left; // CHANGE: root deletion

            if (parent.left == curr) {
                parent.left = curr.left;
            } else {
                parent.right = curr.left;
            }
        }

        // Case 2: Only right child
        else if (curr.left == null && curr.right != null) {
            if (parent == null) return curr.right; // CHANGE: root deletion

            if (parent.right == curr) { // CHANGE: corrected side check
                parent.right = curr.right;
            } else {
                parent.left = curr.right;
            }
        }

        // Case 3: Two children
        else {
            TreeNode pre = inorderPre(curr);

            // CHANGE: Find predecessor's parent
            TreeNode preParent = curr.left;
            if (preParent != pre) {
                while (preParent.right != pre) {
                    preParent = preParent.right;
                }

                // CHANGE: Detach predecessor; preserve its left child
                preParent.right = pre.left;

                // Attach original left subtree
                pre.left = curr.left;
            }

            // Attach original right subtree
            pre.right = curr.right;

            // CHANGE: Handle deleting the root
            if (parent == null) return pre;

            if (parent.left == curr) {
                parent.left = pre;
            } else {
                parent.right = pre;
            }
        }

        return root;
    }

    public TreeNode inorderPre(TreeNode curr) {
        if (curr == null) return null;

        curr = curr.left; // CHANGE: predecessor is in left subtree
        if (curr == null) return null;

        while (curr.right != null) { // CHANGE: find rightmost node
            curr = curr.right;
        }

        return curr;
    }
}
