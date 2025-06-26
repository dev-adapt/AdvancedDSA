package Year2025.leetcodeJune.GREEDY;

import java.util.Arrays;

public class assignCookies {
     public int findContentChildren(int[] child, int[] cookie) {
         Arrays.sort(child);
        Arrays.sort(cookie);
       int count=0;
        int i=child.length-1,j=cookie.length-1;
        while(i>=0 && j>=0){
            if(cookie[j]<child[i]){
                count++;
                i--;
                continue;
            }
            i--;
            j--;
        }
        return child.length - count;
    }
}
