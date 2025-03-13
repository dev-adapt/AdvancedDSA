package GRAPHS;

import java.util.ArrayList;

public class courseScheduleTwo {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[]vis=new int[numCourses];
        int[]pathVis=new int[numCourses];
        int[]res=new int[numCourses];
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<prerequisites.length;i++){
            adj.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }

        for(int i=0;i<numCourses;i++){
            if(vis[i]==0){
                if(!dfs(i, vis, pathVis, res, adj))return new int[0];
            }
        }
        return res;
    }
    public boolean dfs(int source, int[]vis,int[]pathVis,int[]res,ArrayList<ArrayList<Integer>> adj){
        vis[source]=1;
        pathVis[source]=1;

        for(int it:adj.get(source)){
            if(vis[it]==0)dfs(it, vis, pathVis, res, adj);
            else if(pathVis[it]==1)return false;
        }
        pathVis[source]=0;
        res[source]=1;
        return true;
    }
}
