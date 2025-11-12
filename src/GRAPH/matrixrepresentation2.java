package GRAPH;

public class matrixrepresentation2 {
    int[][] adjMatrix;
    matrixrepresentation2(int node) {
        adjMatrix=new  int[node][node];
    }
    public void insert(int[][] matrix, boolean dir) {
        if(dir==true){
            for(int i=0;i<matrix.length;i++){
                int u=matrix[i][0];
                int v=matrix[i][1];
                int k=matrix[i][2];
                adjMatrix[u][v]=k;
            }
        }
        else{
            for(int i=0;i<matrix.length;i++){
                int u=matrix[i][0];
                int v=matrix[i][1];
                int k=matrix[i][2];
                adjMatrix[u][v]=k;
                adjMatrix[v][u]=k;
            }
        }
    }
    public void printMatrix() {
        for(int i=0;i<adjMatrix.length;i++){
            System.out.print("Row "+i+"->");
            for(int j=0;j<adjMatrix[i].length;j++){
                System.out.print(adjMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
//        Without weight
        int[][]edges={{0,2,10},{1,2,20},{1,0,30}};
        int node=4;
        matrixrepresentation2 mr=new matrixrepresentation2(node);
        mr.insert(edges,false);
        mr.printMatrix();



    }
}
