package Year2025.leetcodeMay.DynamicProgramming;
import java.util.*;
public class minCostPAth {
    public int minPathSum(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int[][] dp=new int[n][m];
       for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            dp[i][j]=-1;
        }
       }
        
        return helper(n-1,m-1,grid,dp);
    }
    public int helper(int i,int j,int[][] grid,int[][] dp){
        if(i<0 || j<0)return 7840900;
        if(i==0 && j==0)return grid[i][j];
        if(dp[i][j]!=-1)return dp[i][j];
        int up=grid[i][j]+helper(i-1, j, grid, dp);
        int left=grid[i][j]+helper(i, j-1, grid, dp);

        return dp[i][j]=Math.min(up, left);
    }
    public int minimumCost(int[][]grid){
        int n=grid.length;
        int m=grid[0].length;
        int[]prev=new int[m];
       Arrays.fill(prev, -1);


       for(int i=0;i<n;i++){
        int temp[]=new int[m];
        for(int j=0;j<m;j++){
           if(i==0 && j==0){
            prev[j]=grid[i][j];
            continue;
           }
        int up=7840900,left=7840900;
         if(i>0)up=grid[i][j]+prev[j];
         if(j>0)left=grid[i][j]+temp[j-1];

         temp[j]=Math.min(up, left);
        }
        prev=temp;
       }
       return prev[m-1];
    }
}
