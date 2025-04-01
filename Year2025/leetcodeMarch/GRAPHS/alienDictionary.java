package GRAPHS;

import java.util.*;

public class alienDictionary {
    public String findOrder(String[]dict,int N ,int K){
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();

        for(int i=0;i<K;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<N-1;i++){
            String s1=dict[i];
            String s2=dict[i+1];

            int l=Math.min(s1.length(),s2.length());
            for(int j=0;j<l;j++){
                if(s1.charAt(j)!=s2.charAt(j)){
                    adj.get(s1.charAt(j)-'a').add(s2.charAt(j)-'a');
                    break;
                }
            }
        }
        ArrayList<Integer>topo=toposort(K, adj);
        String s="";
        for(int i=0;i<topo.size();i++){
            s+= (char)(topo.get(i)+'a');
        }
        return s;
    }
    private ArrayList<Integer>toposort(int v, ArrayList<ArrayList<Integer>>adj){
        int indegree[]=new int[v];
        for(int i=0;i<v;i++){
            for(int it:adj.get(i))indegree[it]++;
        }
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<v;i++){
            if(indegree[i]==0)q.add(i);
        }
        ArrayList<Integer>ans=new ArrayList<>();
        while(!q.isEmpty()){
            int node=q.poll();
            ans.add(node);
            for(int it:adj.get(node)){
                indegree[it]--;
                if(indegree[it]==0)q.add(it);
            }
        }
        return ans;
    }
}
