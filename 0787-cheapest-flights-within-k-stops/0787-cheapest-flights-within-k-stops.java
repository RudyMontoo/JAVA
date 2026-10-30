
import java.util.*;

class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {

        List<List<int[]>> adj = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] flight : flights) {
            adj.get(flight[0]).add(new int[]{flight[1], flight[2]});
        }

        Queue<int[]> q = new LinkedList<>();
        int[] dist = new int[n];

        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        // {node, price, stops}
        q.offer(new int[]{src, 0, 0});

        while (!q.isEmpty()) {

            int[] curr = q.poll();

            int node = curr[0];
            int price = curr[1];
            int stops = curr[2];

            // At most k intermediate stops => k + 1 flights
            if (stops > k) {
                continue;
            }

            for (int[] edge : adj.get(node)) {

                int next = edge[0];
                int cost = edge[1];
                int newPrice = price + cost;

                if (newPrice < dist[next]) {
                    dist[next] = newPrice;
                    q.offer(new int[]{next, newPrice, stops + 1});
                }
            }
        }

        return dist[dst] == Integer.MAX_VALUE ? -1 : dist[dst];
    }
}