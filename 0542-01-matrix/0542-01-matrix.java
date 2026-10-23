class pair{
    int first, second;
    public pair(int first, int second){
        this.first=first;
        this.second=second;
    }
}
class Solution {
    int[] dr={-1,1,0,0};
    int[] dc={0,0,-1,1};
    public int[][] updateMatrix(int[][] mat){
        int m=mat.length;
        int n=mat[0].length;
        int[][] dis=new int[m][n];
        Queue<pair> q=new LinkedList<>();

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==0) q.add(new pair(i,j));  // saare 0 queue mein
                else dis[i][j]=-1;                       // -1 = unvisited
            }
        }

        while(!q.isEmpty()){
            pair cur=q.remove();
            for(int k=0;k<4;k++){
                int r=cur.first+dr[k];
                int c=cur.second+dc[k];
                if(r>=0 && c>=0 && r<m && c<n && dis[r][c]==-1){
                    dis[r][c]=dis[cur.first][cur.second]+1;
                    q.add(new pair(r,c));
                }
            }
        }
        return dis;
    }
}