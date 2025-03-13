package GRAPHS;

import java.util.ArrayList;

public class detectCycleInDirectedGrapgh {
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        int[]vis=new int[V];
        int[]pathVis=new int[V];
        for(int i=0;i<V;i++){
            if(vis[i]==0){
                if(checkDfs(i, vis, pathVis, adj))return true;
            }
        }
        return false;
    }
    public boolean checkDfs(int source, int[]vis,int[]pathVis,ArrayList<ArrayList<Integer>> adj){
        vis[source]=1;
        pathVis[source]=1;
        for(int it:adj.get(source)){
            if(vis[it]==0){
                checkDfs(it, vis, pathVis, adj);
            }else if(pathVis[it]==1)return true;
        }
        pathVis[source]=0;
        return false;
    }
}
