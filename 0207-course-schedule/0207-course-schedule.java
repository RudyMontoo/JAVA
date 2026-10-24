//METHOD 1 CYCLIC GRAPH DETACTION USING DFS
class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        
        int[] visited=new int[numCourses];
        int[] pathVis=new int[numCourses];
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<prerequisites.length;i++){
            int v=prerequisites[i][0];
            int u=prerequisites[i][1];
            adj.get(u).add(v);
        }
        for(int i=0;i<numCourses;i++){
        if(visited[i]==0){
            if(dfs(i,adj,visited,pathVis))return false;
        }
        }
    return true;
        
    }

    public boolean dfs(int u, List<List<Integer>> adj,int[] visited, int[] pathVis){
         visited[u]=1;
            pathVis[u]=1;
        for(var v:adj.get(u)){
            if(pathVis[v]==1)return true;
            if(visited[v]==0){
               
                if(dfs(v,adj,visited,pathVis))return true;
                

            }
        }
        pathVis[u]=0;
        return false;
    }
}