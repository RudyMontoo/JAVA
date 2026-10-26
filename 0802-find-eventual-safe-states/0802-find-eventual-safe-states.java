
import java.util.*;

class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        List<Integer> safeNode = new ArrayList<>();

        int[] visited = new int[n];
        int[] pathVisited = new int[n];

        for (int i = 0; i < n; i++) {
            if (!isCycle(i, graph, visited, pathVisited)) {
                safeNode.add(i);
            }
        }

        return safeNode;
    }

    public boolean isCycle(int node, int[][] graph,
                           int[] visited, int[] pathVisited) {
        visited[node] = 1;
        pathVisited[node] = 1;

        for (int x : graph[node]) {
            if (visited[x] == 0) {
                if (isCycle(x, graph, visited, pathVisited)) {
                    return true;
                }
            } else if (pathVisited[x] == 1) {
                return true;
            }
        }

        pathVisited[node] = 0;
        return false;
    }
}