package GRAPH;

public class matrixrepresentation {
    int[][] adjMatrix;
    matrixrepresentation(int node) {
adjMatrix=new  int[node][node];
    }
    public void insert(int[][] matrix, boolean dir) {
        if(dir==true){
            for(int i=0;i<matrix.length;i++){
                int u=matrix[i][0];
                int v=matrix[i][1];
                adjMatrix[u][v]=1;
            }
        }
        else{
            for(int i=0;i<matrix.length;i++){
                int u=matrix[i][0];
                int v=matrix[i][1];
                adjMatrix[u][v]=1;
                adjMatrix[v][u]=1;
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
        int[][] edges={{0,2},{1,2},{1,0}};
        int node=4;
        matrixrepresentation mr=new matrixrepresentation(node);
        mr.insert(edges,false);
        mr.printMatrix();



    }
}
