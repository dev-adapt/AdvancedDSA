package GRAPH;

import java.util.ArrayList;

public class numberOfProvinces {
    static void dfs(int node,ArrayList<ArrayList<Integer>> adjLs,int[]vis){
        vis[node]=1;
        for(Integer it:adjLs.get(node)){
            if(vis[it]==0){
                dfs(it,adjLs,vis);
            }
        }
    }
    static int numProvinces(ArrayList<ArrayList<Integer>> adj, int V) {
        // code here
        ArrayList<ArrayList<Integer>> adjLs=new ArrayList<>();
        for(int i=0;i<V;i++){
         adjLs.add(new ArrayList<Integer>());
        }
        for(int i=0;i<V;i++){
            for(int j=0;j<V;j++){
                if(adj.get(i).get(j)==1 && i!=j){
                    adjLs.get(i).add(j);
                    adjLs.get(j).add(i);
                }
            }
        }
        int vis[]=new int[V];
        int count=0;
        for(int i=0;i<V;i++){
            if(vis[i]==0){
                count++;
                dfs(i,adjLs,vis);
            }
        }
        return count;
    }
    public static void main(String[] args) {
       int V=3;
       ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
       for(int i=0;i<V;i++){
        adj.add(new ArrayList<Integer>());
       }
       adj.get(0).add(1);
       adj.get(0).add(0);
       adj.get(0).add(1);
       adj.get(1).add(0);
       adj.get(1).add(1);
       adj.get(1).add(0);
       adj.get(2).add(1);
       adj.get(2).add(0);
       adj.get(2).add(1);
       System.out.println(numProvinces(adj, V));
    }
}
