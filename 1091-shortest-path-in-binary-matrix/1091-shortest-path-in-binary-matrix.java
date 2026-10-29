class pair{
    int row;
    int col;
    public pair(int row, int col){
        this.row=row;
        this.col=col;
    }
}
class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        if(grid[0][0]==1 || grid[grid.length-1][grid[0].length-1]==1)return -1;
        if(grid.length==1 && grid[0].length==1)return 1;
        int len=0;
        int[][] visited=new int[grid.length][grid[0].length];
        visited[0][0]=1;
        Queue<pair> q=new LinkedList<>();
        q.add(new pair(0,0));
        boolean found=false;
        int[] dr={-1,1,-1,1,1,-1,0,0};
        int[] dc={0,0,-1,1,-1,1,-1,1};
        while(!q.isEmpty()){
            int size=q.size();
            len++;
            for(int k=0;k<size;k++){
            pair node=q.poll();
            int row=node.row;
            int col=node.col;
            if(row==grid.length-1 && col==grid[0].length-1){
                        return len;
                    }
            for(int i=0;i<8;i++){
                int nextrow=row+dr[i];
                int nextcol=col+dc[i];
                if(nextrow>=0 && nextcol>=0 && nextrow<grid.length && nextcol<grid[0].length && grid[nextrow][nextcol]==0 && visited[nextrow][nextcol]==0){
                    q.add(new pair(nextrow, nextcol));
                    visited[nextrow][nextcol]=1;
                }
            }
            }
        }
        
        return -1;
    }
}