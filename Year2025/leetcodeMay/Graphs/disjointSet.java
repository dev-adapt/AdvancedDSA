package Year2025.leetcodeMay.Graphs;
import java.util.*;
public class disjointSet {
    class disjoint{
        List<Integer> parent=new ArrayList<>();
        List<Integer> rank=new ArrayList<>();
        List<Integer> size=new ArrayList<>();
       
        public disjoint(int n){
            for(int i=0;i<=n;i++){
                parent.add(i);
                rank.add(0);
                size.add(1);
            }
        }
        public int findUparent(int node){
            if(node==parent.get(node))return node;
            int ulp=findUparent(parent.get(node));
            parent.set(node, ulp);
            return ulp;
        }

        public void unionByRank(int u,int v){
            int ulp=findUparent(u);
            int vlp=findUparent(v);
            if(ulp==vlp)return;
           
            if(rank.get(ulp)>rank.get(vlp))
                parent.set(vlp, ulp);
            
            else if(rank.get(ulp)<rank.get(vlp)) parent.set(vlp,ulp);

            else{
                parent.set(vlp, ulp);
                int rk=rank.get(ulp);
                rank.set(ulp, rk+1);
            }
        }
    
      public void unionBySize(int u,int v){
        int ulp=findUparent(u);
            int vlp=findUparent(v);
            if(ulp==vlp)return;

            if(size.get(ulp)>size.get(vlp)){
                parent.set(vlp, ulp);
              
                size.set(ulp, size.get(ulp)+size.get(vlp) );
            }else{
                parent.set(ulp,vlp);
                size.set(vlp,size.get(ulp)+size.get(vlp));
            }
      }
    }
}
