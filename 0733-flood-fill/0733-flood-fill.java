class Solution {
    public void dfs(int ro, int co, int org, int color, int[][] image){
        image[ro][co]=color;
        int[] dr={-1,1,0,0};
        int[] dc={0,0,1,-1};
        for(int k=0;k<4;k++){
            int row=ro+dr[k];
            int col=co+dc[k];
            if(row>=0 && row<image.length && col>=0 && col<image[0].length && image[row][col]==org){
                dfs(row,col,org,color,image);
            }
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int org=image[sr][sc];
        if (org == color) return image;
        dfs(sr, sc, org,color, image);
        return image;
    }
}