package GRAPHS;

import java.util.ArrayList;
import java.util.Stack;

public class toposort {
       public static  Stack<Integer>st=new Stack<>();
        static ArrayList<Integer> topologicalSort(ArrayList<ArrayList<Integer>> adj) {
        // Your code here
        int n=adj.size();
        int[]vis=new int[n];
        for(int i=0;i<n;i++){
            if(vis[i]==0)dfs(vis[i], adj, vis);
        }
        ArrayList<Integer>ans=new ArrayList<>();
        while(!st.isEmpty()){
            ans.add(st.pop());
        }
        return ans;
    }
    static void dfs(int node,ArrayList<ArrayList<Integer>> adj,int[]vis) {
        for(int it:adj.get(node)){
            if(vis[it]==0)dfs(it, adj, vis);
        }
        st.push(node);
        }
}
