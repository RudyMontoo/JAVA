class pair{
    int first, second;
    public pair(int first, int second){
        this.first=first;
        this.second=second;
    }
}
class Solution {
    public void solve(char[][] board) {
        int m=board.length;
        int n=board[0].length;
        int[][] visited=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]=='O' && visited[i][j]==0){
                    bfs(i,j,visited,board);
                }
            }
        }
    }

    public void bfs(int i, int j, int[][] visited, char[][] board){
        int m=board.length, n=board[0].length;
        Queue<pair> q=new LinkedList<>();
        Queue<pair> q1=new LinkedList<>();   // region ke saare cells
        q.add(new pair(i,j));
        q1.add(new pair(i,j));
        visited[i][j]=1;
        boolean touchesEdge=false;
        int[] dr={-1,1,0,0};
        int[] dc={0,0,-1,1};

        while(!q.isEmpty()){
            pair cur=q.remove();
            int row=cur.first, col=cur.second;

            if(row==0 || row==m-1 || col==0 || col==n-1) touchesEdge=true;

            for(int k=0;k<4;k++){
                int nrow=row+dr[k];
                int ncol=col+dc[k];
                if(nrow>=0 && nrow<m && ncol>=0 && ncol<n
                   && visited[nrow][ncol]==0 && board[nrow][ncol]=='O'){
                    visited[nrow][ncol]=1;
                    q.add(new pair(nrow,ncol));
                    q1.add(new pair(nrow,ncol));
                }
            }
        }
        if(!touchesEdge) replace(q1, board);
    }

    public void replace(Queue<pair> q1, char[][] board){
        while(!q1.isEmpty()){
            pair p=q1.remove();
            board[p.first][p.second]='X';
        }
    }
}