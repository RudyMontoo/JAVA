
import java.util.*;

class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] p : prerequisites) {
            int u = p[0];
            int v = p[1];

            adj.get(v).add(u);
        }

        int[] indegree = new int[numCourses];

        for (int i = 0; i < numCourses; i++) {
            for (int x : adj.get(i)) {
                indegree[x]++;
            }
        }

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) {
                q.offer(i);
            }
        }

        int[] result = new int[numCourses];
        int idx = 0;

        while (!q.isEmpty()) {
            int node = q.poll();
            result[idx++] = node;

            for (int x : adj.get(node)) {
                indegree[x]--;

                if (indegree[x] == 0) {
                    q.offer(x);
                }
            }
        }

        // If not all courses were processed, a cycle exists.
        if (idx != numCourses) {
            return new int[0];
        }

        return result;
    }
}
