class pair{
    int first;
    int second;
    public pair(int first, int second){
        this.first=first;
        this.second=second;
    }
}
class Solution {
    public void bfs(int ro, int co, int[][] visited, char[][] grid){
        visited[ro][co]=1;
        Queue<pair> q=new LinkedList<pair>();
        q.add(new pair(ro,co));
        int m=grid.length;
        int n=grid[0].length;
        int[] dr = {-1, 1, 0, 0};   
        int[] dc = {0, 0, -1, 1};
        while(!q.isEmpty()){
            int row=q.peek().first;
            int col=q.peek().second;
            q.remove();
            for(int k=0;k<4;k++){
                    int nrow=row+dr[k];
                    int ncol=col+dc[k];
                    if(nrow>=0 && nrow<m && ncol>=0 && ncol<n && visited[nrow][ncol]==0 && grid[nrow][ncol]=='1'){
                        visited[nrow][ncol]=1;
                        q.add(new pair(nrow, ncol));
                    }
                }
            
        }
    }

    public int numIslands(char[][] grid) {
        int m=grid.length , n=grid[0].length;
        int noIsland=0;
        int[][] visited=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1' && visited[i][j]==0){
                    bfs(i,j,visited,grid);
                    noIsland++;
                }
            }
        }
        return noIsland;
    }
}