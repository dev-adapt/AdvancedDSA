package Year2025.leetcodeJune.DynamicProgramming;

import java.util.*;

public class baloonBurst {
     public int maxCoins(int[] nums) {
        List<Integer>a=new ArrayList<>();
        a.add(1);
        int n=nums.length;
        for(int i=0;i<n;i++)a.add(nums[i]);
        a.add(1);

        int dp[][]=new int[n+2][n+2];
        for(int i=n-1;i>=1;i--){
            for(int j=1;j<n;j++){
                int maxi=Integer.MIN_VALUE;
                for(int idx=i;idx<=j;idx++){
                    if(i>j)continue;
                    int cost=a.get(i-1)*a.get(idx)*a.get(j+1)+dp[i][idx-1]+dp[idx+1][j];
                    maxi=Math.max(maxi,cost);
                }
                dp[i][j]=maxi;
            }
        }
        return dp[1][n];
    }
}
