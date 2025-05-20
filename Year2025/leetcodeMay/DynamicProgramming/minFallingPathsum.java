package Year2025.leetcodeMay.DynamicProgramming;
import java.util.*;
public class minFallingPathsum {
    public int minFallingPathSum(int[][] matrix) {
        int n=matrix.length,m=matrix[0].length;
        int[][] dp=new int[n][m];
        for(int[]rows:dp)Arrays.fill(rows,-1);

        int mini=Integer.MAX_VALUE;

        for(int j=0;j<m;j++){
            int ans=helper(n-1, j, mini, matrix, dp);
            mini=Math.min(mini, ans);
        }
        return mini;
    }
    public int helper(int i,int j,int m,int[][]matrix,int[][]dp){
        if(j<0 || j>=m)return 1000100;
        if(i==0)return matrix[i][j];
        if(dp[i][j]!=-1)return dp[i][j];

        int up=matrix[i][j]+helper(i-1, j, m, matrix, dp);
        int leftdiagonal=matrix[i][j]+helper(i-1, j-1, m, matrix, dp);
        int rightdiagonal=matrix[i][j]+helper(i-1, j+1, m, matrix, dp);

        return dp[i][j]=Math.min(up,Math.min(leftdiagonal, rightdiagonal));
    }

    
    static int  minFallingPathSum2(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        int dp[][] = new int[n][m];

        // Initializing the first row - base condition
        for (int j = 0; j < m; j++) {
            dp[0][j] = matrix[0][j];
        }

        // Calculate the maximum path sum for each cell in the matrix
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int up = matrix[i][j] + dp[i - 1][j];

                int leftDiagonal = matrix[i][j];
                if (j - 1 >= 0) {
                    leftDiagonal += dp[i - 1][j - 1];
                } else {
                    leftDiagonal += 1000100;
                }

                int rightDiagonal = matrix[i][j];
                if (j + 1 < m) {
                    rightDiagonal += dp[i - 1][j + 1];
                } else {
                    rightDiagonal += 1000100;
                }

                // Store the maximum of the three paths in dp
                dp[i][j] = Math.min(up, Math.min(leftDiagonal, rightDiagonal));
            }
        }

        // Find the maximum value in the last row of dp
        int mini = Integer.MAX_VALUE;
        for (int j = 0; j < m; j++) {
            mini = Math.min(mini, dp[n - 1][j]);
        }

        return mini;
    }
}
