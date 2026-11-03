class Solution {
    int[] parent, rank;

    void initialize(int n) {
        parent = new int[n];
        rank = new int[n];
        for (int i = 0; i < n; i++) parent[i] = i;
    }

    int find(int node) {
        if (parent[node] == node) return node;
        return parent[node] = find(parent[node]);
    }

    void union(int u, int v) {
        int pu = find(u), pv = find(v);
        if (pu == pv) return;

        if (rank[pu] < rank[pv]) {
            parent[pu] = pv;
        } else if (rank[pu] > rank[pv]) {
            parent[pv] = pu;
        } else {
            parent[pv] = pu;
            rank[pu]++;
        }
    }

    public int removeStones(int[][] stones) {
        int OFFSET = 10001;          // col ko row se alag karne ke liye
        initialize(20002);           // rows: 0..10000, cols: 10001..20001

        Set<Integer> used = new HashSet<>();

        for (int[] s : stones) {
            int rowNode = s[0];
            int colNode = s[1] + OFFSET;
            union(rowNode, colNode);
            used.add(rowNode);
            used.add(colNode);
        }

        Set<Integer> components = new HashSet<>();
        for (int node : used) {
            components.add(find(node));
        }

        return stones.length - components.size();
    }
}