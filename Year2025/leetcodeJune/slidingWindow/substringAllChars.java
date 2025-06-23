import java.util.*;

public class substringAllChars {
      public int numberOfSubstrings(String s) { //abcaa
       int[]arr=new int[3];
        int count=0;
        int r=0,n=s.length();
        while(r<n){
           arr[s.charAt(r)-'a']=r;
           if(arr[0]!=0 && arr[1]!=0 && arr[2]!=0){
            int idx=Math.min(arr[0], Math.min(arr[1], arr[2]));
            count+=idx+1;
           }
           r++;
        }
        return count;
    }
}
