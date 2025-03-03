package GRAPHS;

import java.util.*;

public class detectCycleBFS {
    class pair{
        int first;
        int sec;
        public pair(int first,int sec){
            this.first=first;
            this.sec=sec;
        }
    }
     public boolean isCycle(ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean vis[]=new boolean[adj.size()];
        Arrays.fill(vis,false);

        //for visiting al the components
        for(int i=0;i<adj.size();i++){
            if(!vis[i]){
               if( checkCycle(i, -1, vis, adj))return true;
            }
        }
        return false;
    }
    public boolean checkCycle(int src,int v,boolean vis[],ArrayList<ArrayList<Integer>> adj){
        vis[src]=true;
        Queue<pair>q=new LinkedList<>();
        q.add(new pair(src,v));
        while(!q.isEmpty()){
            pair p=q.poll();
            int node=p.first;
            int parent=p.sec;

            for(Integer it:adj.get(node)){
                if(!vis[it]){
                    q.add(new pair(it,node));
                    vis[it]=true;
                }else if(parent!=it)return true;
            }
        }
        return false;
    }
}
