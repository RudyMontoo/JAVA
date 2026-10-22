class pair{
    int first;
    int second;
    public pair(int first,int second){
        this.first=first;
        this.second=second;
    }
}
class Solution{
    public int numEnclaves(int[][] grid){
        // traverse all which are at boundary and those who connected with that
        int m=grid.length;
        int n=grid[0].length;
        if(m==1 || n==1)return 0; 
        int[][] visited=new int[m][n];
        Queue<pair> q=new LinkedList<pair>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if((i==0 || j==0 || i==m-1 || j==n-1) && grid[i][j]==1){
                    q.add(new pair(i,j));
                     visited[i][j]=1;
                }
            }
        }
        int[] dr={-1,1,0,0};
        int[] dc={0,0,-1,1};
        while(!q.isEmpty()){
            int r=q.peek().first;
            int c=q.peek().second;
            q.remove();
           
            for(int k=0;k<4;k++){
                int row=r+dr[k];
                int col=c+dc[k];
                if(row>=0 && row<m && col>=0 && col<n && visited[row][col]==0 && grid[row][col]==1){
                    visited[row][col]=1;
                    q.add(new pair(row,col));
                }
            }
        }
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1 && visited[i][j]==0){
                    count++;
                }
            }
        }
        return count;
    }
}