import java.util.*;

class pair {
    int v;
    long t;

    public pair(int v, long t) {
        this.v = v;
        this.t = t;
    }
}

class Solution {
    public int countPaths(int n, int[][] roads) {

        int MOD = 1_000_000_007;

        List<List<pair>> adj = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] road : roads) {
            int u = road[0];
            int v = road[1];
            int t = road[2];

            adj.get(u).add(new pair(v, t));
            adj.get(v).add(new pair(u, t));
        }

        long[] dis = new long[n];
        Arrays.fill(dis, Long.MAX_VALUE);

        int[] ways = new int[n];

        PriorityQueue<pair> pq =
            new PriorityQueue<>((a, b) -> Long.compare(a.t, b.t));

        dis[0] = 0;
        ways[0] = 1;

        pq.offer(new pair(0, 0));

        while (!pq.isEmpty()) {

            pair curr = pq.poll();

            int node = curr.v;
            long time = curr.t;

            if (time > dis[node]) {
                continue;
            }

            for (pair x : adj.get(node)) {

                int next = x.v;
                long newTime = time + x.t;

                // Found a shorter path
                if (newTime < dis[next]) {

                    dis[next] = newTime;
                    ways[next] = ways[node];

                    pq.offer(new pair(next, newTime));
                }

                // Found another path with equal shortest time
                else if (newTime == dis[next]) {

                    ways[next] = (int) (
                        ((long) ways[next] + ways[node]) % MOD
                    );
                }
            }
        }

        return ways[n - 1];
    }
}