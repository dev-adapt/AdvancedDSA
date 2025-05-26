package Year2025.leetcodeMay.DynamicProgramming;

import java.util.Arrays;

public class coinChange {
     public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int dp[][]=new int[n][amount+1];
        for(int rows[]:dp) Arrays.fill(rows, -1);
        return helper(n-1, amount, coins, dp);
    }
    int helper(int idx,int target,int[]arr,int [][]dp){
        if(idx==0){
            if(target%arr[0]==0) return target/arr[0];
            else return (int)(1e9);
        }
        if(dp[idx][target]!=-1)return dp[idx][target];
        int nottake=helper(idx-1,target,arr,dp);
        int take=(int)(1e9);
        if(arr[idx]<=target) take=1+helper(idx, target-arr[idx], arr, dp);
        return dp[idx][target]=Math.min(take, nottake);
    }
}
