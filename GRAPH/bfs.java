package GRAPH;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class bfs {
       public static ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
           ArrayList<Integer> bfs=new ArrayList<Integer>();
          boolean vis[]=new boolean[V+1];
          Queue<Integer>q=new LinkedList<>();
          q.add(0);
          vis[0]=true;
          while(!q.isEmpty()){
              Integer node=q.poll();
              bfs.add(node);
              
              for(Integer it:adj.get(node)){
                  if(vis[it]==false){
                      vis[it]=true;
                      q.add(it);
                  }
              }
          }
          return bfs;
    }
    public static void main(String[] args) {
        int V=5,E=4;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<=V;i++){
            adj.add(new ArrayList<Integer>());
        }
        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(0).add(3);
        adj.get(2).add(4);
        ArrayList<Integer> traversal=new ArrayList<>();
        traversal=bfsOfGraph(V, adj);
        System.out.println(traversal);
    }
}
