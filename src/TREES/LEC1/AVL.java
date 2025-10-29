package TREES.LEC1;

public class AVL {

    public static class Node {
        int value;
        int height;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
            this.height = 0;
        }

        public int getValue() {
            return value;
        }
    }

    private Node root;

    public AVL() {
        // Empty constructor
    }

    public int height() {
        return height(root);
    }
    public int height(Node node) {
        if (node == null) {
            return -1;
        } else {
            return node.height;
        }
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void display() {
        display(root, "Root Node: ");
    }

    private void display(Node node, String details) {
        if (node == null) {
            return;
        }
        System.out.println(details + node.getValue());
        display(node.left, "Left child of " + node.getValue() + ": ");
        display(node.right, "Right child of " + node.getValue() + ": ");
    }

    public void populate(int[] num) {
        for (int i = 0; i < num.length; i++) {
            this.insert(num[i]);
        }
    }

    public void insert(int value) {
        root = insert(root, value);
    }

    private Node insert(Node node, int value) {
        if (node == null) {
            return new Node(value);
        }

        if (value < node.value) {
            node.left = insert(node.left, value);
        } else if (value > node.value) {
            node.right = insert(node.right, value);
        }
        node.height = 1 + Math.max(height(node.left), height(node.right));


        return rotate(node);
    }
    private Node rotate(Node node) {
if(height(node.left) -height(node.right)>1) {
//left heavy
    if(height(node.left.left)-height(node.left.right)>0) {
        //it is left left case
        return rightRotate(node);
    }
    if(height(node.left.left)-height(node.left.right)<0) {
        //it is left right case
        node.left=leftRotate(node);
        return rightRotate(node);
    }
}
        if(height(node.left) -height(node.right)<-1) {
//right heavy
            if(height(node.right.left)-height(node.right.right)<0) {
                //it is right right case
                return leftRotate(node);
            }
            if(height(node.right.left)-height(node.right.right)>0) {
                //it is left right case
                node.right=rightRotate(node);
                return leftRotate(node);
            }
        }
return node;
    }
    public Node rightRotate(Node p) {
        Node c=p.left;
        Node t=p.right;
        c.right=p;
        p.left=t;
        p.height=Math.max(height(p.left), height(p.right))+1;
        c.height=Math.max(height(c.left), height(c.right))+1 ;
        return c;
    }
    public Node leftRotate(Node c) {
        //initial
        Node p=c.right;
        Node t=p.left;
        //final
        p.left=c;
        c.right=t;
        p.height=Math.max(height(p.left), height(p.right)+1);
        c.height=Math.max(height(c.left), height(c.right)+1);
        return p;
    }

    public boolean balanced() {
        return balanced(root);
    }

    private boolean balanced(Node node) {
        if (node == null) {
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }

    public void inorder() {
        inorder(root);

    }

    private void inorder(Node node) {
        if (node == null) {
            return;
        }
        inorder(node.left);
        System.out.print(node.value + " ");
        inorder(node.right);
    }
}