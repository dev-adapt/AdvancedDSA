package GRAPHS;

import java.util.ArrayList;



public class DFS {
    public ArrayList<Integer> dfsOfGraph(ArrayList<ArrayList<Integer>> adj) {
        int V=adj.size();
        boolean vis[]=new boolean[V];
        vis[0]=true;
        ArrayList<Integer> ans=new ArrayList<>();
        dfs(adj, vis, ans, 0);
        return ans;
    } 
    public void dfs(ArrayList<ArrayList<Integer>> adj,boolean[]vis, ArrayList<Integer> ans,int node){
        vis[node]=true;
        ans.add(node);
        for(int it:adj.get(node)){
           if(!vis[it])dfs(adj, vis, ans, it);
        }
    }
}
