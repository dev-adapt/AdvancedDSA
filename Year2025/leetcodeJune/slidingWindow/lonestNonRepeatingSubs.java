package Year2025.leetcodeJune.slidingWindow;

import java.util.HashMap;

public class lonestNonRepeatingSubs {
     public int lengthOfLongestSubstring(String s) {
       int longest=0;
       int n=s.length();
      int l=0,r=0;
      HashMap<Integer,Integer>mp=new HashMap<>();
     while ( l<=r && r<n) {
        int c=s.charAt(r);
        if(!mp.containsKey(c)){
            mp.put(c,r);
          
        }else{
            l=mp.get(c)+1;
            mp.replace(c,r);
        }
        longest=Math.max(longest,r-l+1);
     }
     return longest;
    }
}
