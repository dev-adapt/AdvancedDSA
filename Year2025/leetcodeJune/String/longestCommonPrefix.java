package Year2025.leetcodeJune.String;

public class longestCommonPrefix {
     public String longestCommonPrefix(String[] strs) {
              int n=strs.length;
        StringBuilder ans=new StringBuilder("");
        int maxi=Integer.MAX_VALUE;
        if(n==1)return strs[0];
        for(int i=0;i<n;i++){
            maxi=Math.min(maxi, strs[i].length());
        }
       char curr=' ';
        for(int j=0;j<maxi;j++){
             for(int i=1;i<n;i++){
                if(strs[0].charAt(j)!=strs[i].charAt(j))
                    return ans.toString();
                
               curr=strs[0].charAt(j);
            }
            ans.append(curr);
        }
        
        return ans.toString();
    }
    
}
