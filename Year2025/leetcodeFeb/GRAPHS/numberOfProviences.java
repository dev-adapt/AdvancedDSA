package GRAPHS;

import java.util.ArrayList;

public class numberOfProviences {
    public int findCircleNum(int[][] isConnected) {
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        for(int i=0;i<isConnected.length;i++){
            adj.add(new ArrayList<Integer>());
        }
        for(int i=0;i<isConnected.length;i++){
            for(int j=0;j<isConnected[i].length;j++){
                if(isConnected[i][j]==1){
                    adj.get(i).add(j);
                }
            }
        }
        int count=0;
        boolean vis[]=new boolean[isConnected.length];
        for(int i=0;i<vis.length;i++){
            if(!vis[i]){
                count++;
                dfs(adj, vis, i);
            }
        }
        return count;
    }
    public void dfs( ArrayList<ArrayList<Integer>>adj, boolean vis[],int node){
        vis[node]=true;
        for(int it:adj.get(node)){
            if(!vis[it])dfs(adj, vis, it);
        }
    }
}
