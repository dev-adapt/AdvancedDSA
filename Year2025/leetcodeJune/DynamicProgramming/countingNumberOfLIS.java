package Year2025.leetcodeJune.DynamicProgramming;

import java.util.Arrays;

public class countingNumberOfLIS {
     public int findNumberOfLIS(int[] nums) {
                int n=nums.length;
        int dp[]=new int[n];
        int ct[]=new int[n];
        Arrays.fill(ct,1);
        Arrays.fill(dp, 1);
        int maxi=1;
        for(int i=0;i<n;i++){
            for(int prev=0;prev<i;prev++){
                if(nums[i]>nums[prev] && dp[prev]+1>dp[i]){
                    dp[i]=dp[prev]+1;
                    ct[i]=ct[prev];
                }else if(nums[i]>nums[prev] && dp[prev]+1==dp[i]){
                    ct[i]+=ct[prev];
                }
            }
            maxi=Math.max(maxi, dp[i]);
        }
       int nos=0;
       for(int i=0;i<n;i++){
        if(dp[i]==maxi)nos+=ct[i];
       }
       return nos;
    }
}
