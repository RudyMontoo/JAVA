class pair{
    int row;
    int col;
    int time;
    public pair(int row, int col, int time){
        this.row=row;
        this.col=col;
        this.time=time;
    }
}
class Solution {
    public int swimInWater(int[][] grid) {
        int n=grid.length;
        int[][] time = new int[n][n];

        for(int i = 0; i < n; i++){
            Arrays.fill(time[i], Integer.MAX_VALUE);
        }
        time[0][0]=grid[0][0];
        PriorityQueue<pair> pq=new PriorityQueue<pair>((a,b)-> a.time-b.time);
        pq.add(new pair(0,0,time[0][0]));
        
        int[] dr={-1,1,0,0};
        int[] dc={0,0,-1,1};

        while(!pq.isEmpty()){
            pair node=pq.poll();
            int currrow=node.row;
            int currcol=node.col;
            int currtime=node.time;
            if(currcol==n-1 && currrow==n-1)return currtime;
            for(int k=0;k<4;k++){
                int row=currrow+dr[k];
                int col=currcol+dc[k];
                if(row>=0 && col>=0 && row<n && col<n ){
                    int newTime = Math.max(currtime, grid[row][col]);
                    if(time[row][col]>newTime){
                        time[row][col]=newTime;
                        pq.add(new pair(row,col,time[row][col]));
                    }
                }
            }
        }
        
        return time[n-1][n-1];
    }
}