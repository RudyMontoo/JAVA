package TREES.LEC1.Implementattion;

import java.util.*;

public class BinarySearchTree {
    Node root;

    // INSERTION
    void insert(int value) {
        root = insertRec(value, root);
    }

    private Node insertRec(int value, Node root) {
        if (root == null) {
            return new Node(value);
        }
        if (value < root.val) {
            root.left = insertRec(value, root.left);
        }
        else if (value > root.val) {
            root.right = insertRec(value, root.right);
        }
        // If value == root.val, do nothing (no duplicates)
        return root;
    }

    // DELETION
    void delete(int value) {
        root = deleteRec(value, root);
    }

    private Node deleteRec(int value, Node root) {
        if (root == null) {
            return null;
        }
        if (value < root.val) {
            root.left = deleteRec(value, root.left);
        } else if (value > root.val) {
            root.right = deleteRec(value, root.right);
        } else {
            // Node to be deleted found
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;
            // Node with two children: Get inorder successor (min in right subtree)
            root.val = minValueNode(root.right);
            root.right = deleteRec(root.val, root.right);
        }
        return root;
    }

    // Helper to get minimum value from a node
    private int minValueNode(Node node) {
        int minv = node.val;
        while (node.left != null) {
            node = node.left;
            minv = node.val;
        }
        return minv;
    }

    // TRAVERSAL
    void display() {
        inorder(root);
    }

    void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.println(root.val);
        inorder(root.right);
    }

    void preorder(Node root) {
        if (root == null) return;
        System.out.println(root.val);
        preorder(root.left);
        preorder(root.right);
    }

    void postorder(Node root) {
        if (root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.val);
    }

    // SEARCHING
    void search(int value) {
        Node found = searchRec(value, root);
        if (found != null) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }

    private Node searchRec(int value, Node root) {
        while (root != null) {
            if (root.val == value) return root;
            if (value < root.val) root = root.left;
            else root = root.right;
        }
        return null;
    }

    // Minimum Value
    void minValue() {
        if (root == null) {
            System.out.println("Tree is empty.");
            return;
        }
        Node curr = root;
        while (curr.left != null) {
            curr = curr.left;
        }
        System.out.println("Minimum Value: " + curr.val);
    }

    // Maximum Value
    void maxValue() {
        if (root == null) {
            System.out.println("Tree is empty.");
            return;
        }
        Node curr = root;
        while (curr.right != null) {
            curr = curr.right;
        }
        System.out.println("Maximum Value: " + curr.val);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinarySearchTree tree = new BinarySearchTree();
        while (true) {
            System.out.println("1:Insert, 2:Delete, 3:Search, 4:Display, 5:Min, 6:Max, 7:Exit");
            int op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.print("Enter value to insert: ");
                    int val = sc.nextInt();
                    tree.insert(val);
                    break;
                case 2:
                    System.out.print("Enter value to delete: ");
                    val = sc.nextInt();
                    tree.delete(val);
                    break;
                case 3:
                    System.out.print("Enter value to search: ");
                    val = sc.nextInt();
                    tree.search(val);
                    break;
                case 4:
                    System.out.println("Inorder traversal:");
                    tree.display();
                    break;
                case 5:
                    tree.minValue();
                    break;
                case 6:
                    tree.maxValue();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option");
            }
        }
    }
}

// Minimal Node class
class Node {
    int val;
    Node left, right;
    public Node(int val) { this.val = val; }
}
