package GRAPHS;

import java.util.*;

public class kahnsAlgorithm {
       static ArrayList<Integer> topologicalSort(ArrayList<ArrayList<Integer>> adj) {
        int V=adj.size();
        int[]indegree=new int[V];
        for(int i=0;i<V;i++) {
            for(int it:adj.get(i)){
                indegree[it]++;
            }
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<V;i++)if(indegree[i]==0)q.add(i);
        ArrayList<Integer>toposort=new ArrayList<>();

       // int i=0;
        while(!q.isEmpty()) {
            int node=q.poll();
            toposort.add(node);
            for(int it:adj.get(node)) {
                indegree[it]--;
                if(indegree[it]==0)q.add(it);
            }
        }
        return toposort;
       }
}
