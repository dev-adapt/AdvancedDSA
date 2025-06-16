package Year2025.leetcodeJune.DynamicProgramming;
import java.util.*;

public class minimumCost {
        public int minCost(int n, int[] arr) {
        int c=arr.length;
        List<Integer>cuts=new ArrayList<>();
        for(int i=0;i<c;i++){
            cuts.add(arr[i]);
        }
        cuts.add(0);
        cuts.add(n);
        Collections.sort(cuts);

        int dp[][]=new int[c+2][c+2];
        for(int []rows:dp)Arrays.fill(rows, 0);
        
        for(int i=c;i>=1;i--){
            for(int j=1;j<=c;j++){
                if(i>j)continue;
                int mini=Integer.MAX_VALUE;
                for(int idx=i;idx<=j;idx++){
                    int ans=cuts.get(j+1)-cuts.get(i-1)+dp[i][idx-1]+dp[idx+1][j];
                    mini=Math.min(mini,ans);
                }
                dp[i][j]=mini;
            }
        }
        return dp[1][c];
    }
}
