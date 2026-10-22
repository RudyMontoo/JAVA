class pair{
    int first;
    int second;
    public pair(int first,int second){
        this.first=first;
        this.second=second;
    }
}
class Solution{
    public int orangesRotting(int[][] grid) {
        // method -> firstly count no of orange as well thre a rotten or not in grid 
        int fresh=0;
        int m=grid.length, n=grid[0].length;
        int[][] visited=new int[m][n];
        Queue<pair> q=new LinkedList<pair>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2){
                    q.add(new pair(i,j));
                    visited[i][j]=1;
                }
                if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        
        int time=0;
        int[] dr={-1,1,0,0};
        int[] dc={0,0,-1,1};
        while(!q.isEmpty() && fresh>0){
            int size=q.size();
            for(int s=0;s<size;s++){
            int r=q.peek().first;
            int c=q.peek().second;
            q.remove();
            for(int k=0;k<4;k++){
                int row=r+dr[k];
                int col=c+dc[k];
                if(row>=0 && row<m && col>=0 && col<n && visited[row][col]==0 && grid[row][col]==1){
                    visited[row][col]=1;
                    grid[row][col]=2;
                    fresh--;
                    q.add(new pair(row,col));
                }
            }
            }
            time++;
        }
        int rotten=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2)rotten++;
            }
        }
        

       return (fresh==0)?time:-1; 
    }
}