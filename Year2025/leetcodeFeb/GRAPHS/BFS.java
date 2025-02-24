package GRAPHS;

import java.util.*;

public class BFS {
     public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // code here
        boolean[]vis=new boolean[V];
        ArrayList<Integer>ans=new ArrayList<>();
        Queue<Integer>q=new LinkedList<>();
        q.add(0);
        vis[0]=true;
        while(!q.isEmpty()){
            Integer node=q.poll();
            ans.add(node);
            for(int it:adj.get(node)){
                if(!vis[it]){
                    vis[it]=true;
                    q.add(it);
                }
            }
        }
        return ans;
    }
}
