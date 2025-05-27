package Year2025.leetcodeMay.DynamicProgramming;

public class longestPalindromicSubsequence {
     public int longestPalindromeSubseq(String s) {
       String rev=new StringBuilder(s).reverse().toString();
      return  longestCommonSubsequence(s, rev);
    }
     public int longestCommonSubsequence(String s1, String s2) {
        int n=s1.length(),m=s2.length();
        int prev[]=new int[m+1];
        int curr[]=new int[m+1];
        prev[0]=0;
        curr[0]=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1))curr[j]=1+prev[j-1];
                else curr[j]=Math.max(prev[j],curr[j-1]);
            }
           // prev=curr;
           prev = (int[]) (curr.clone());
        }
        return prev[m];
    }
}
