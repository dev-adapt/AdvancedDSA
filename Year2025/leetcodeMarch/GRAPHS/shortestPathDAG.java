package GRAPHS;
import java.util.*;
public class shortestPathDAG {
    class pair{
        int first,sec;
        public pair(int first,int sec){
            this.first = first;
            this.sec = sec;
        }
    }
    public int[] shortestPath(int V, int E, int[][] edges) {
        // Code here
        ArrayList<ArrayList<pair>> adj = new ArrayList<>();
        for(int i=0;i<V;i++)adj.add(new ArrayList<>());

        for(int i=0;i<edges.length;i++){
                adj.get(edges[i][0]).add(new pair(edges[i][1], edges[i][2]));
        }
        Stack <Integer>st=new Stack<>();
        int vis[]=new int[V];

        for(int i=0;i<V;i++){
            if(vis[i]==0)toposort(adj, st, vis, i);
        }
        int dist[]=new int[V];
        Arrays.fill(dist,(int)1e9);

       dist[0]=0;
       while(!st.isEmpty()){
        int node=st.pop();
        for(int i=0;i<adj.get(node).size();i++){
            int v=adj.get(node).get(i).first;
            int wt=adj.get(node).get(i).sec;

            if(dist[node]+wt<dist[v])dist[v]=dist[node]+wt;
        }
       }
       return dist;
    }
    void toposort(ArrayList<ArrayList<pair>> adj , Stack <Integer>st,int vis[],int node){
        vis[node]=1;
        for(int i=0;i<adj.get(node).size();i++){
            int v=adj.get(node).get(i).first;
            if(vis[v]==0){
                toposort(adj, st, vis, v);
            }
        }
        st.add(node);
    }
}
