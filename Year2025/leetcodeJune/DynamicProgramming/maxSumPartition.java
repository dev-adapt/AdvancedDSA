package Year2025.leetcodeJune.DynamicProgramming;

public class maxSumPartition {
     public int maxSumAfterPartitioning(int[] arr, int k) {
        int n=arr.length;
        int[] dp=new int[n+1];
        for(int ind=n-1;ind>=0;ind--){
            int maxi=Integer.MIN_VALUE,maxAns=Integer.MIN_VALUE,len=0;
            for(int j=ind;j<Math.min(ind+k, n);j++){
                maxi=Math.max(maxi,arr[j]);
                len++;
                int sum=len*maxi+dp[j+1];
                maxAns=Math.max(maxAns,sum);
            }
            dp[ind]=maxAns;
        }
        return dp[0];
    }
}
