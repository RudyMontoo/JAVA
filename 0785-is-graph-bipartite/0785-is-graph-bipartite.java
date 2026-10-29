// METHOD-> BFS
class Solution {
    public boolean isBipartite(int[][] graph) {
        
        String[] set=new String[graph.length];  //colr A B

        for(int i=0;i<graph.length;i++){
            if(set[i]!=null)continue;
        Queue<Integer> q=new LinkedList<>();
             q.add(i);
        set[i]="A";
        while(!q.isEmpty()){
            int u=q.poll();
            String setpart=(set[u].equals("A"))?"B":"A";
            for(var v:graph[u]){
                if(set[v]==null){
                    q.add(v);
                    set[v]=setpart;
                }
                else if(set[v].equals(set[u])){
                    return false;
                }
            }
        }
        }
        return true;
    }
}

// // METHOD 2 
// class Solution {
//     public boolean isBipartite(int[][] graph) {
//         String[] set = new String[graph.length];

//         for (int i = 0; i < graph.length; i++) {
//             if (set[i] == null) {
//                 set[i] = "A";

//                 if (!dfs(i, graph, set)) {
//                     return false;
//                 }
//             }
//         }

//         return true;
//     }

//     private boolean dfs(int u, int[][] graph, String[] set) {
//         for (int v : graph[u]) {
//             if (set[v] == null) {
//                 set[v] = set[u].equals("A") ? "B" : "A";

//                 if (!dfs(v, graph, set)) {
//                     return false;
//                 }
//             } else if (set[v].equals(set[u])) {
//                 return false;
//             }
//         }

//         return true;
//     }
// }