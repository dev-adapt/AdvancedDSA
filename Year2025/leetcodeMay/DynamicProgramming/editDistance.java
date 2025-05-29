package Year2025.leetcodeMay.DynamicProgramming;

public class editDistance {
     public int minDistance(String s, String t) {
        int n=s.length(), m=t.length();
        int prev[]=new int[m+1];
        for(int j=0;j<=m;j++)prev[j]=j;
        int curr[]=new int[m+1];

        for(int i=0;i<=n;i++){
            curr[0]=i;
            for(int j=0;j<=m;j++){
                if(s.charAt(i-1)==t.charAt(j))curr[j]=prev[j-1];
                else curr[j]=1+Math.min(prev[j-1],Math.min(prev[j], curr[j-1]));
            }
             prev=(int[])(curr.clone());
        }
        return curr[m];
    }
}
