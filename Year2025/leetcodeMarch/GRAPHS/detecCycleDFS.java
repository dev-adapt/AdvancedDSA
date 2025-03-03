package GRAPHS;

import java.util.ArrayList;
import java.util.Arrays;

public class detecCycleDFS {
     public boolean isCycle(ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean vis[]=new boolean[adj.size()];
        Arrays.fill(vis,false);

        //for visiting al the components
        for(int i=0;i<adj.size();i++){
            if(!vis[i]){
             if( dfs(i, -1, vis, adj))return true;
            }
        }
        return false;
    }
    boolean dfs(int node,int parent, boolean vis[],ArrayList<ArrayList<Integer>> adj){
        vis[node]=true;
        for(Integer it:adj.get(node)){
            if(!vis[it]){
                vis[it]=true;
                dfs(it,node, vis, adj);
            }else if(parent!=it)return true;
        }
        return false;
    }
}
