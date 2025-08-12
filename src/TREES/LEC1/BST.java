package TREES.LEC1;



public class BST {
    public class Node {
        private int value;
        private int height;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
            this.height = 0;
        }

        public int getValue() {
            return value;
        }
    }

    private Node root;

    public BST() {
        // Empty constructor
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

    public void populate(int [] num){
        for(int i=0;i<num.length;i++){
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



        return node;
    }

    public boolean balanced(){
        return balanced(root);
    }
    private boolean balanced(Node node){
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


//    public void min(){
//        System.out.println(min1(root));
//    }
//    private int  min1(Node node){
//        if (node == null){
//            throw new RuntimeException("Null");
//        }
//        Node temp=node;
//        while(temp.left!=null){
//            temp=temp.left;
//        }
//        return temp.value;
//    }

    public void min() {
        if (root == null) {
            System.out.println("Tree is empty");
        } else {
            System.out.println(min1(root));
        }
    }

    private int min1(Node node) {
        if (node == null) throw new RuntimeException("Null");
        Node temp = node;
        while (temp.left != null) {
            temp = temp.left;
        }
        return temp.value;
    }
}




