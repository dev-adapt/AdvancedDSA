package leetcodeJUNE;

import java.util.HashMap;

public class findCenterOfStarGraph {
    public static int findCenter(int[][] edges) {
        int n=edges.length;
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<n;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            mp.put(u,mp.getOrDefault(u,0)+1);
            mp.put(v,mp.getOrDefault(v,0)+1);
            if(mp.get(v)==n)return v;
            if(mp.get(u)==n)return u;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[][]edges = {{1,2},{5,1},{1,3},{1,4}};
        System.out.println(findCenter(edges));
    }
}
