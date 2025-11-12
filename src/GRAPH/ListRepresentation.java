package GRAPH;

import java.util.ArrayList;

public class ListRepresentation {
    ArrayList<ArrayList<Integer>> List;
    ListRepresentation(int nodes){
        List=new ArrayList<>();
        for(int i=0;i<nodes;i++){
            List.add(new ArrayList<>());
        }
    }
    public void insert(int[][] edges ,boolean dir){
        for(int [] edge:edges){
            int u=edge[0];
            int v=edge[1];
            if(dir){
                List.get(u).add(v);

            }
            else{
                List.get(v).add(u);
                List.get(u).add(v);
            }

        }
    }
    public void printList(){
        for(int i=0;i<List.size();i++){
            System.out.print(i+"->");
            System.out.print("[");
            for(int j=0;j<List.get(i).size();j++){

                System.out.print(List.get(i).get(j));
                if(i!=List.size()-1){
                    System.out.print(" ");
                }
            }
            System.out.println("]");
        }
    }


    public void findDegreeDirected(int[][] edges,int nodes){
        int[] indegree=new int[nodes];
        int[] outdegree=new int[nodes];
        for(int [] edge:edges){

            int u=edge[0];
            int v=edge[1];
            indegree[v]++;
            outdegree[u]++;
        }
        for(int i=0;i<nodes;i++){
            System.out.println("For "+i+" InDegree->"+indegree[i]+" OutDegree->"+outdegree[i]);
        }

    }
    public void findDegreeUndirected(int[][] edges,int nodes){
        int[] degree=new int[nodes];

        for(int [] edge:edges){

            int u=edge[0];
            int v=edge[1];
            degree[v]++;
            degree[u]++;
        }
        for(int i=0;i<nodes;i++){
            System.out.println("For "+i+" Degree->"+degree[i]);
        }

    }
    public static void main(String[] args) {
        int nodes=4;
        int[][] edges={{0,2},{2,1},{1,3}};
        ListRepresentation lr=new ListRepresentation(nodes);
        lr.insert(edges,true);
        lr.findDegreeDirected(edges,nodes);
        lr.findDegreeUndirected(edges,nodes);
        lr.printList();
    }
}
