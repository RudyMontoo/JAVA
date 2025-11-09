package TREES.LEC1.Implementattion;
import java.util.*;

//This is also known as BFS

    class TreeNode {
        int val;
        TreeNode1 left, right;
        TreeNode(int x) { val = x; }
    }

    class BST {
        TreeNode1 root;

        // Insert
        void insert(int val) {
            root = insertRec(root, val);
        }

        TreeNode1 insertRec(TreeNode1 node, int val) {
            if(node == null) return new TreeNode1(val);
            if(val < node.val)
                node.left = insertRec(node.left, val);
            else if(val > node.val)
                node.right = insertRec(node.right, val);
            return node;
        }

        // Delete
        void delete(int val) {
            root = deleteRec(root, val);
        }

        TreeNode1 deleteRec(TreeNode1 node, int val) {
            if(node == null) return null;
            if(val < node.val)
                node.left = deleteRec(node.left, val);
            else if(val > node.val)
                node.right = deleteRec(node.right, val);
            else {
                // Node with only one child or no child
                if(node.left == null)
                    return node.right;
                else if(node.right == null)
                    return node.left;
                // Node with two children: Get inorder successor (smallest in right subtree)
                node.val = minValue(node.right);
                node.right = deleteRec(node.right, node.val);
            }
            return node;
        }

        int minValue(TreeNode1 node) {
            int minv = node.val;
            while(node.left != null) {
                minv = node.left.val;
                node = node.left;
            }
            return minv;
        }

        // Level order traversal
        void levelOrder() {
            if (root == null) {
                System.out.println("Tree is empty.");
                return;
            }
            Queue<TreeNode1> queue = new LinkedList<>();
            queue.add(root);

            while(!queue.isEmpty()) {
                TreeNode1 curr = queue.poll();
                System.out.print(curr.val + " ");
                if(curr.left != null)
                    queue.add(curr.left);
                if(curr.right != null)
                    queue.add(curr.right);
            }
            System.out.println();
        }
    }

    public class Level_Order_Traversal {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            BST1 bst = new BST1();
            // Example array
            int[] arr = {30, 20, 40, 10, 25, 35, 50};
            for(int num : arr)
                bst.insert(num);
            System.out.println("Level Order Traversal:");
                        bst.depthOrder();

        }
    }

