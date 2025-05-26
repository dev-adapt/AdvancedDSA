package Year2025.leetcodeMay.DynamicProgramming;

public class coinChange2 {
   
    public int change(int amount, int[] coins) {
        int n=coins.length;
        int prev[]=new int[amount+1];
        prev[0]=1;

        for(int i=0;i<n;i++){
             int curr[]=new int[amount+1];
            curr[0]=1;
            for(int target=0;target<=amount;target++){
                int notTake=prev[target];
                int take=0;
                if(coins[i]<=target)take=curr[target-coins[i]];

                curr[target]=take+notTake;
            }
            prev=curr;
        }
        return prev[amount];
    }
}

