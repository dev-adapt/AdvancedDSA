package GRAPHS;
import java.util.*;
public class IsBipartite {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[]color=new int[n];
        Arrays.fill(color,-1);
        for(int i=0;i<n;i++){
            if(color[i]==-1){
              if (! dfs(i, color, graph))return false;
            }
        }
        return true;
    }
   public boolean dfs(int start,int[]color,int[][]graph){
    color[start]=0;
    for(int it:graph[start]){
        if(color[it]==-1)
          if (! dfs(it, color, graph))return false;
    }
    return true;
   }
}
