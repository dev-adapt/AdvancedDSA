package GRAPHS;

import java.util.ArrayList;

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
        List<>topo=
    }
}
