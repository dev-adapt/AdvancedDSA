package GRAPH;

import java.util.ArrayList;

public class dfs {
    public static void dfs(int node,boolean vis[],ArrayList<ArrayList<Integer>> adj,ArrayList<Integer>ls){
        vis[node]=true;
        ls.add(node);
        for(int it:adj.get(node)){
            if(!vis[it]){
                dfs(it, vis, adj, ls);
            }
        }
    }
    public static ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean[]vis=new boolean[V+1];
        vis[0]=true;

        ArrayList<Integer> ls = new ArrayList<>();
        dfs(0, vis, adj, ls);
        return ls;
    }
    public static void main(String[] args) {
        int V=5;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<=V;i++){
            adj.add(new ArrayList<Integer>());
        }
        adj.get(0).add(2);
        adj.get(0).add(3);
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(2).add(4);
        adj.get(2).add(0);
        adj.get(3).add(0);
        adj.get(4).add(2);
        ArrayList<Integer> traversal=new ArrayList<>();
        traversal=dfsOfGraph(V, adj);
        System.out.println(traversal);
    }
}
