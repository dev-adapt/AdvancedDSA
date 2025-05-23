package Year2025.leetcodeMay.DynamicProgramming;
import java.util.*;
public class partioningEqually {
     public boolean canPartition(int[] nums) {
        int n=nums.length;
        int sum=0;
        
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        if(sum%2!=0)return false;
        sum/=2;
        int[][]dp=new int[n][sum+1];
        for(int[]rows:dp){
            Arrays.fill(rows,-1);
        }
        return subsetSumEqualToK(n-1, sum, nums, dp);
    }
    boolean subsetSumEqualToK(int idx,int target,int[]arr,int[][]dp){
        if(target==0)return true;
        if(idx==0){
            if(arr[0]==target)return true;
        }
        if(dp[idx][target]!=-1)return dp[idx][target]==0?false:true;
        boolean notTake=subsetSumEqualToK(idx-1, target, arr, dp);
        boolean take=false;
        if(arr[idx]<=target){
            take=subsetSumEqualToK(idx-1, target-arr[idx], arr, dp);
        }
        dp[idx][target]=take||notTake?1:0;
        return take||notTake;
    }
}
