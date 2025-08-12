package TREES.LEC1;

public class SEGMENT_TREE {
    public static void main(String[] args) {
        int[] arr = {3, 8, 6, 7, -2, -8, 4, 9};
        SEGMENT_TREE tree = new SEGMENT_TREE(arr);
//        tree.display();
        System.out.println(tree.query(2, 5)); // Example query
        tree.update(3, 10); // Example update
        tree.display();
    }

    private static class Node {
        int data;
        int startinterval;
        int endinterval;
        Node left, right;

        public Node(int startinterval, int endinterval) {
            this.startinterval = startinterval;
            this.endinterval = endinterval;
        }
    }

    Node root;

    public SEGMENT_TREE(int[] arr) {
        this.root = ConstructTree(arr, 0, arr.length - 1);
    }

    private Node ConstructTree(int[] arr, int start, int end) {
        if (start == end) {
            Node leaf = new Node(start, end);
            leaf.data = arr[start];
            return leaf;
        }
        Node node = new Node(start, end);
        int mid = start + (end - start) / 2;
        node.left = ConstructTree(arr, start, mid);
        node.right = ConstructTree(arr, mid + 1, end);
        node.data = node.left.data + node.right.data;
        return node;
    }

    public void display() {
        display(this.root);
    }

    private void display(Node node) {
        if (node == null) return;
        String str = "";
        if (node.left != null) {
            str += "Left [Interval=" + node.left.startinterval + "-" + node.left.endinterval + ", data: " + node.left.data + "] ";
        } else {
            str += "No left child ";
        }
        str += "Current [Interval=" + node.startinterval + "-" + node.endinterval + ", data: " + node.data + "] ";
        if (node.right != null) {
            str += "Right [Interval=" + node.right.startinterval + "-" + node.right.endinterval + ", data: " + node.right.data + "]";
        } else {
            str += "No right child";
        }
        System.out.println(str);

        display(node.left);
        display(node.right);
    }

    // Range Sum Query
    public int query(int qsi, int qei) {
        return query(this.root, qsi, qei);
    }

    private int query(Node node, int qsi, int qei) {
        if (node == null || node.endinterval < qsi || node.startinterval > qei) {
            // Completely outside
            return 0;
        }
        if (node.startinterval >= qsi && node.endinterval <= qei) {
            // Completely inside
            return node.data;
        }
        // Partially inside and partially outside
        return query(node.left, qsi, qei) + query(node.right, qsi, qei);
    }

    // Point Update
    public void update(int index, int value) {
        update(this.root, index, value);
    }

    private int update(Node node, int index, int value) {
        if (node == null) return 0;
        if (index < node.startinterval || index > node.endinterval) {
            return node.data;
        }
        if (node.startinterval == node.endinterval && node.startinterval == index) {
            node.data = value;
            return node.data;
        }
        int leftans = update(node.left, index, value);
        int rightans = update(node.right, index, value);
        node.data = leftans + rightans;
        return node.data;
    }
}