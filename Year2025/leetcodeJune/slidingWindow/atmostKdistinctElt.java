import java.util.*;

public class atmostKdistinctElt {
     public static int kDistinctChar(String s, int k) {
       int l=0,r=0;
       int n=s.length();
       int ans=0;
       HashMap<Character,Integer>set=new HashMap<>();
       while(r<n){
        set.put(s.charAt(r), set.getOrDefault(s.charAt(r),0)+1);
        while(set.size()>k){
           set.replace(s.charAt(l), set.get(s.charAt(l))-1);
           if(set.get(s.charAt(l))==0) set.remove(s.charAt(l));
           l++;
        } 
        ans=Math.max(ans,r-l+1);
        r++;
       }
       return ans;
    }
    public static void main(String[] args) {
       String s = "abcddefg";
       int k=3;
       System.out.println(kDistinctChar(s, k));
    }
}
