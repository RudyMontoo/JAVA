package TREES.LEC1;

import java.util.Scanner;

public class BINARYTREE {
    private static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
        // The constructor below is unnecessary and can be removed
        // public void BINARYTREE() {}
    }

    private Node root; // Add a root node to store tree's entry point

    // Insert element
    public void populate(Scanner scanner) {
        System.out.println("Enter the value of the binary tree:");
        int value = scanner.nextInt();
        root = new Node(value); // Set the root
        populate(scanner, root);
    }

    private void populate(Scanner scanner, Node node) {
        System.out.println("Do you want to enter left of binary tree: " + node.value);
        boolean left = scanner.nextBoolean();
        if (left) {
            System.out.println("Enter the value at left of binary tree: " + node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner, node.left);
        }
        System.out.println("Do you want to enter right of binary tree: " + node.value);
        boolean right = scanner.nextBoolean();
        if (right) {
            System.out.println("Enter the value at right of binary tree: " + node.value);
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner, node.right);
        }
    }

    public void display() {
        display(root, ""); // Use root node to start display
    }

    private void display(Node node, String indent) {
        if (node == null) { // Should be node == null to stop recursion
            return;
        }
        System.out.println(indent + node.value + " ");
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }

public void prettyDisplay(){
     prettyDisplay(root,0);
}


    private void prettyDisplay(Node node,int level) {
        if(node==null){
            return;
        }
        prettyDisplay(node.right,level+1);
        if(level!=0){
for(int i=0;i<level-1;i++){
    System.out.print("|\t\t");
}
            System.out.println("|-------->"+node.value);
        }
        else{
            System.out.println(node.value);
        }
        prettyDisplay(node.left,level+1);
    }
}