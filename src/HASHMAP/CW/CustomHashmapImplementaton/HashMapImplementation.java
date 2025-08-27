package HASHMAP.CW.CustomHashmapImplementaton;

import java.util.LinkedList;

public class HashMapImplementation {
    static class MyHashMap<K, V> {
        public static final int Default_Capacity = 4;
        public static final float Default_Load_Factor = .75f;

        public class Node {
            K key;
            V value;

            Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; // Number of entries in map
        private LinkedList<Node>[] buckets;

        private void initBuckets(int N) {
            buckets = new LinkedList[N];
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }
        }

        private int HashFunc(K key) {
            int hc = key.hashCode();
            return Math.abs(hc) % buckets.length;
        }

        // Traverse the ll and look for a node with 'key'. If found, return its index, otherwise return -1
        private int searchInBucket(LinkedList<Node> ll, K key) {
            for (int i = 0; i < ll.size(); i++) {
                if (ll.get(i).key.equals(key)) {
                    return i;
                }
            }
            return -1;
        }

        public MyHashMap() {
            initBuckets(Default_Capacity);
        }

        public int size() {
            return n;
        }

        public void put(K key, V value) {
            int bi = HashFunc(key);
            LinkedList<Node> currbucket = buckets[bi];
            int idx = searchInBucket(currbucket, key);
            if (idx == -1) {
                currbucket.add(new Node(key, value));
                n++;
            } else {
                currbucket.get(idx).value = value;
            }

            // Rehash if load factor exceeded
            float lambda = (float) n / buckets.length;
            if (lambda > Default_Load_Factor) {
                rehash();
            }
        }

        public V get(K key) {
            int bi = HashFunc(key);
            LinkedList<Node> currbucket = buckets[bi];
            int idx = searchInBucket(currbucket, key);
            if (idx == -1) {
                return null;
            } else {
                return currbucket.get(idx).value;
            }
        }

        public V remove(K key) {
            int bi = HashFunc(key);
            LinkedList<Node> currbucket = buckets[bi];
            int idx = searchInBucket(currbucket, key);
            if (idx == -1) {
                return null;
            } else {
                V val = currbucket.get(idx).value;
                currbucket.remove(idx);
                n--;
                return val;
            }
        }

        private void rehash() {
            LinkedList<Node>[] oldBuckets = buckets;
            initBuckets(oldBuckets.length * 2);
            n = 0;
            for (LinkedList<Node> bucket : oldBuckets) {
                for (Node node : bucket) {
                    put(node.key, node.value);
                }
            }
        }
    }

    public static void main(String[] args) {
        MyHashMap<Integer, String> myHashMap = new MyHashMap<>();
        myHashMap.put(1, "one");
        myHashMap.put(2, "two");
        myHashMap.put(3, "three");
        System.out.println(myHashMap.get(2)); // Output: two
        System.out.println(myHashMap.remove(2)); // Output: two
        System.out.println(myHashMap.get(2)); // Output: null
        System.out.println(myHashMap.size()); // Output: 2
    }
}