class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        int nProv=0;
        int[] visited=new int[n];
        for(int i=0;i<n;i++){
            if(visited[i]==0){
                nProv++;
                dfs(i,visited,isConnected);
            }
        }
        return nProv;
    }
    public void dfs(int u, int[] visited, int[][] edge){
        visited[u]=1;
        for(int v=0;v<edge.length;v++){
            if(edge[u][v]==1 && visited[v]!=1){
                dfs(v,visited,edge);
            }
        }
    }
}