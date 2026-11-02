class Solution {
    int[] rank;
    int[] parent;
    public int makeConnected(int n, int[][] connections) {
        if(n-1>connections.length)return -1; //not possible to replace edges
        rank=new int[n];
        parent=new int[n];
        for(int i=0;i<n;i++){
            parent[i]=i;
        }
        int component=n;
        for(int i=0;i<connections.length;i++){
            int pu=findParents(connections[i][0]);
            int pv=findParents(connections[i][1]);
            if(pu!=pv){
            if (rank[pu] < rank[pv]) {
            parent[pu] = pv;
            } 
            else if (rank[pu] > rank[pv]) {
                parent[pv] = pu;
            } 
            else {
                parent[pv] = pu;
                rank[pu]++;
            }
            component--;
                }

            
        }
        return component-1;

        

    }
    
    public int findParents(int x){
        if(parent[x]==x)return x;
        return findParents(parent[x]);
    }
}