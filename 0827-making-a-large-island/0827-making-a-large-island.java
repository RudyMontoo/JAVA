class Solution {
    int[] parent;
    int[] rank;
    int[] size;

    // Initialize DSU
    public void initialize(int n) {
        parent = new int[n];
        rank = new int[n];
        size=new int[n];

        for (int i = 0; i < n; i++) {
            parent[i] = i;
            rank[i] = 0;
            size[i]=1;
        }
    }

    // Find ultimate parent
    public int find(int node) {
        if (parent[node] == node) {
            return node;
        }

        return parent[node] = find(parent[node]);
    }

    // Union by Rank
    public void union(int u, int v) {

        int pu = find(u);
        int pv = find(v);

        if (pu == pv) return;

        if (rank[pu] < rank[pv]) {
            parent[pu] = pv;
            size[pv]+=size[pu];
        }
        else if (rank[pu] > rank[pv]) {
            parent[pv] = pu;
            size[pu]+=size[pv];
        }
        else {
            parent[pv] = pu;
            rank[pu]++;
             size[pu]+=size[pv];
        }
    }
    public int largestIsland(int[][] grid) {
        
        int n=grid.length;
        initialize(n*n);
        int[] dr={-1,1,0,0};
        int[] dc={0,0,-1,1};

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int row=i;
                int col=j;
                if(grid[row][col]==0)continue;
                for(int k=0;k<4;k++){
                    int nr=row+dr[k];
                    int nc=col+dc[k];
                    if(nr<n && nc<n && nr>=0 && nc>=0 && grid[nr][nc]==1){
                        int pu=find(row*n+col);
                        int pv=find(nr*n+nc);
                        if(pu!=pv){
                            union(pu,pv);
                        }
                    }
                }
            }
        }
        // Step 3: try flipping each 0
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) continue;

                Set<Integer> set = new HashSet<>();
                for (int k = 0; k < 4; k++) {
                    int nr = i + dr[k], nc = j + dc[k];
                    if (nr >= 0 && nc >= 0 && nr < n && nc < n && grid[nr][nc] == 1) {
                        set.add(find(nr * n + nc));
                    }
                }

                int total = 1;                 // the flipped cell itself
                for (int p : set) {
                    total += size[p];
                }
                max = Math.max(max, total);
            }
        }

        // Step 4: no 0 existed (all 1s)
        for (int i = 0; i < n * n; i++) max = Math.max(max, size[find(i)]);
        return max;
        

    }
}