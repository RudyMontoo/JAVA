package Huffman_Coding;

import java.util.*;

public class HuffmanCoder {
    private HashMap<Character, String> encode;
    private HashMap<String, Character> decode;

    private class Node implements Comparable<Node> {
        Character data;
        int cost;
        Node left;
        Node right;

        public Node(Character data, int cost) {
            this.data = data;
            this.cost = cost;
        }

        @Override
        public int compareTo(Node o) {
            return this.cost - o.cost;
        }
    }

    public HuffmanCoder(String feeder) throws Exception {
        // Step 1: Frequency map
        HashMap<Character, Integer> fmap = new HashMap<>();
        for (int i = 0; i < feeder.length(); i++) {
            char ch = feeder.charAt(i);
            fmap.put(ch, fmap.getOrDefault(ch, 0) + 1);
        }

        // Step 2: Create min heap (PriorityQueue)
        PriorityQueue<Node> minHeap = new PriorityQueue<>();
        for (Map.Entry<Character, Integer> entry : fmap.entrySet()) {
            Node node = new Node(entry.getKey(), entry.getValue());
            minHeap.add(node);
        }

        // Step 3: Build Huffman tree
        while (minHeap.size() > 1) {
            Node first = minHeap.remove();
            Node second = minHeap.remove();

            Node newNode = new Node('\0', first.cost + second.cost);
            newNode.left = first;
            newNode.right = second;

            minHeap.add(newNode);
        }

        Node root = minHeap.remove();

        // Step 4: Build encode/decode maps
        this.encode = new HashMap<>();
        this.decode = new HashMap<>();

        buildCodes(root, "");

    }

    // Recursive helper to assign codes
    private void buildCodes(Node node, String path) {
        if (node == null)
            return;

        if (node.left == null && node.right == null) {
            encode.put(node.data, path);
            decode.put(path, node.data);
            return;
        }

        buildCodes(node.left, path + "0");
        buildCodes(node.right, path + "1");
    }

    // Encode string into Huffman bits
    public String encode(String source) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < source.length(); i++) {
            sb.append(encode.get(source.charAt(i)));
        }
        return sb.toString();
    }

    // Decode Huffman bits into original string
    public String decode(String codedString) {
        StringBuilder sb = new StringBuilder();
        String key = "";

        for (int i = 0; i < codedString.length(); i++) {
            key += codedString.charAt(i);
            if (decode.containsKey(key)) {
                sb.append(decode.get(key));
                key = "";
            }
        }
        return sb.toString();
    }

    // For testing
    public static void main(String[] args) throws Exception {
        String test = "huffman coding example";
        HuffmanCoder coder = new HuffmanCoder(test);

        String encoded = coder.encode(test);
        System.out.println("Encoded: " + encoded);

        String decoded = coder.decode(encoded);
        System.out.println("Decoded: " + decoded);
    }
}
