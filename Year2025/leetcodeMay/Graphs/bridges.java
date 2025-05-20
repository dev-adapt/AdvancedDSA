package Year2025.leetcodeMay.Graphs;
import java.util.*;
public class bridges {
    private int timer=1;
    private void dfs(int node,int parent,int[]vis,List<List<Integer>>adj,int[]tin,int[]low,List<List<Integer>>bridges){
        tin[node]=low[node]=timer;
        timer++;

        for(Integer it:adj.get(node)){
            if(it==parent)continue;
            if(vis[it]==0){
                dfs(it,node,vis,adj,tin,low,bridges);
                low[node]=Math.min(low[node],low[it]);
                if(low[it]>tin[node])bridges.add(Arrays.asList(it,node));
            }else low[node]=Math.min(low[node],low[it]);
        }
    }
    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        List<List<Integer>>adj=new ArrayList<List<Integer>>() ;
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<Integer>());
        }
        for(List<Integer>ls:connections){
            adj.get(ls.get(1)).add(ls.get(0));
            adj.get(ls.get(0)).add(ls.get(1));
        }
        int[]vis=new int[n];
        int[]tin=new int[n];
        int[]low=new int[n];
        List<List<Integer>>bridges=new ArrayList<List<Integer>>();
        dfs(0, -1, vis, adj, tin, low, bridges);
        return bridges;
    }
}
