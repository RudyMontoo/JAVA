package TREES.LEC1.Implementattion;

import java.util.*;

public class AVLTree {
    Node root;

    // Get height of a node
    private int height(Node node) {
        if (node == null)
            return 0;
        return node.height;
    }

    // Get balance factor of a node
    private int getBalance(Node node) {
        if (node == null)
            return 0;
        return height(node.left) - height(node.right);
    }

    // Update height of a node
    private void updateHeight(Node node) {
        if (node != null) {
            node.height = 1 + Math.max(height(node.left), height(node.right));
        }
    }

    // Right rotate
    private Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        // Perform rotation
        x.right = y;
        y.left = T2;

        // Update heights
        updateHeight(y);
        updateHeight(x);

        return x; // new root
    }

    // Left rotate
    private Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        // Perform rotation
        y.left = x;
        x.right = T2;

        // Update heights
        updateHeight(x);
        updateHeight(y);

        return y; // new root
    }

    // INSERTION
    void insert(int value) {
        root = insertRec(root, value);
    }

    private Node insertRec(Node node, int value) {
        // 1. Perform normal BST insertion
        if (node == null) {
            return new Node(value);
        }

        if (value < node.val) {
            node.left = insertRec(node.left, value);
        } else if (value > node.val) {
            node.right = insertRec(node.right, value);
        } else {
            // Duplicate values not allowed
            return node;
        }

        // 2. Update height of current node
        updateHeight(node);

        // 3. Get balance factor
        int balance = getBalance(node);

        // 4. If unbalanced, there are 4 cases:

        // Left Left Case
        if (balance > 1 && value < node.left.val) {
            return rightRotate(node);
        }

        // Right Right Case
        if (balance < -1 && value > node.right.val) {
            return leftRotate(node);
        }

        // Left Right Case
        if (balance > 1 && value > node.left.val) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // Right Left Case
        if (balance < -1 && value < node.right.val) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node; // return unchanged node
    }

    // DELETION
    void delete(int value) {
        root = deleteRec(root, value);
    }

    private Node deleteRec(Node node, int value) {
        // 1. Perform standard BST delete
        if (node == null) {
            return null;
        }

        if (value < node.val) {
            node.left = deleteRec(node.left, value);
        } else if (value > node.val) {
            node.right = deleteRec(node.right, value);
        } else {
            // Node to be deleted found

            // Node with only one child or no child
            if (node.left == null) {
                return node.right;
            } else if (node.right == null) {
                return node.left;
            }

            // Node with two children: Get inorder successor
            node.val = minValue(node.right);
            node.right = deleteRec(node.right, node.val);
        }

        // 2. Update height of current node
        updateHeight(node);

        // 3. Get balance factor
        int balance = getBalance(node);

        // 4. If unbalanced, there are 4 cases:

        // Left Left Case
        if (balance > 1 && getBalance(node.left) >= 0) {
            return rightRotate(node);
        }

        // Left Right Case
        if (balance > 1 && getBalance(node.left) < 0) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // Right Right Case
        if (balance < -1 && getBalance(node.right) <= 0) {
            return leftRotate(node);
        }

        // Right Left Case
        if (balance < -1 && getBalance(node.right) > 0) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    // Helper to get minimum value from a node
    private int minValue(Node node) {
        int minv = node.val;
        while (node.left != null) {
            node = node.left;
            minv = node.val;
        }
        return minv;
    }

    // SEARCHING
    void search(int value) {
        Node found = searchRec(root, value);
        if (found != null) {
            System.out.println("Found: " + value);
        } else {
            System.out.println("Not Found: " + value);
        }
    }

    private Node searchRec(Node node, int value) {
        if (node == null || node.val == value) {
            return node;
        }

        if (value < node.val) {
            return searchRec(node.left, value);
        } else {
            return searchRec(node.right, value);
        }
    }

    // DISPLAY - Inorder Traversal
    void display() {
        if (root == null) {
            System.out.println("Tree is empty.");
            return;
        }
        System.out.println("Inorder traversal:");
        inorder(root);
        System.out.println();
    }

    private void inorder(Node node) {
        if (node == null) return;
        inorder(node.left);
        System.out.print(node.val + " ");
        inorder(node.right);
    }




    // Display tree structure
    void displayTree() {
        System.out.println("Tree Structure:");
        displayTreeRec(root, "", true);
    }

    private void displayTreeRec(Node node, String prefix, boolean isTail) {
        if (node == null) return;

        System.out.println(prefix + (isTail ? "└── " : "├── ") + node.val + " (h=" + node.height + ")");

        if (node.left != null || node.right != null) {
            if (node.right != null) {
                displayTreeRec(node.right, prefix + (isTail ? "    " : "│   "), false);
            }
            if (node.left != null) {
                displayTreeRec(node.left, prefix + (isTail ? "    " : "│   "), true);
            }
        }
    }

    // Get height of tree
    void height() {
        System.out.println("Height of tree: " + height(root));
    }

    // Check if tree is balanced
    void checkBalance() {
        if (isBalanced(root)) {
            System.out.println("Tree is balanced (AVL property maintained)");
        } else {
            System.out.println("Tree is NOT balanced");
        }
    }

    private boolean isBalanced(Node node) {
        if (node == null) return true;

        int balance = getBalance(node);
        return Math.abs(balance) <= 1 && isBalanced(node.left) && isBalanced(node.right);
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



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AVLTree tree = new AVLTree();

        while (true) {
            System.out.println("\n=== AVL Tree Operations ===");
            System.out.println("1: Insert");
            System.out.println("2: Delete");
            System.out.println("3: Search");
            System.out.println("4: Display (Inorder)");

            System.out.println("9: Height");
            System.out.println("10: Check Balance");

            System.out.println("13: Exit");
            System.out.print("Enter your choice: ");

            int op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.print("Enter value to insert: ");
                    int val = sc.nextInt();
                    tree.insert(val);
                    System.out.println(val + " inserted successfully.");
                    break;
                case 2:
                    System.out.print("Enter value to delete: ");
                    val = sc.nextInt();
                    tree.delete(val);
                    System.out.println(val + " deleted successfully.");
                    break;
                case 3:
                    System.out.print("Enter value to search: ");
                    val = sc.nextInt();
                    tree.search(val);
                    break;
                case 4:
                    tree.display();
                    break;

                case 5:
                    tree.displayTree();
                    break;
                case 6:
                    tree.height();
                    break;
                case 7:
                    tree.checkBalance();
                    break;

                case 8:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}


