class pair{
    int row;
    int col;
    int distance;
    public pair(int row, int col, int distance){
        this.row=row;
        this.col=col;
         this.distance=distance;
    }
}
class Solution {
    public int minimumEffortPath(int[][] heights) {
        // DIJIKSTRA ALGORITHM
        int n=heights.length;
        int m=heights[0].length;
        PriorityQueue<pair> pq =new PriorityQueue<pair>((a,b)->a.distance-b.distance);
        pq.add(new pair(0,0,0));
        int[][] dist=new int[n][m];
        for(int[] row : dist){
        Arrays.fill(row,Integer.MAX_VALUE);           
        }
        dist[0][0]=0;
        int[] dr={-1,1,0,0};
        int[] dc={0,0,1,-1};
        while (!pq.isEmpty()) {
        pair node = pq.poll();

        int row = node.row;
        int col = node.col;
        int distance = node.distance;

        // Skip outdated entries
        if (distance > dist[row][col]) {
            continue;
        }

        // Return when the destination is reached
        if (row == n - 1 && col == m - 1) {
            return distance;
        }

        for (int i = 0; i < 4; i++) {
            int nr = row + dr[i];
            int nc = col + dc[i];

            if (nr >= 0 && nc >= 0 && nr < n && nc < m) {
                int newEffort = Math.max(
                    distance,
                    Math.abs(heights[row][col] - heights[nr][nc])
                );

                if (newEffort < dist[nr][nc]) {
                    dist[nr][nc] = newEffort;
                    pq.add(new pair(nr, nc, newEffort));
                }
            }
        }
    }

    return 0;
    }
}