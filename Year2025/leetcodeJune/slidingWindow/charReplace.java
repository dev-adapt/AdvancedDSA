import java.util.HashMap;

public class charReplace {
         public int characterReplacement(String s, int k) {  //ABBABAB
        HashMap<Character,Integer>mp=new HashMap<>();
        int n=s.length();
        int l=0,r=0,maxlen=0;
        while(r<n){
          if(mp.size()<=k){
            mp.put(s.charAt(r),mp.getOrDefault(s.charAt(r),0)+1);
          }else if(mp.containsKey(s.charAt(r))){
            mp.replace(s.charAt(r),mp.get(s.charAt(r))+1);
          }
          else{
              mp.replace(s.charAt(l),mp.get(s.charAt(l))-1);
              mp.put(s.charAt(r),1);
              l++;  
          }
          int len=r-l+1;
          maxlen=Math.max(maxlen, len);
          r++;
        }
        return maxlen;
    }
}
