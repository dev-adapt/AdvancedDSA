package leetcodePractice;

public class missingAndRepeated {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        long totalSum=0,totalSumSquare=0;
        long n=grid.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<grid[0].length;j++){
                long curr=grid[i][j];
                totalSum+=curr;
                totalSumSquare+=curr*curr;
            }
        }
        long num=n*n;
        long actualSum=(num*(num+1))/2;
        long actualSquareSum=(num*(num+1)*(2*num+1))/6;

        long A=actualSum-totalSum;
        long B=(actualSquareSum-totalSumSquare)/A;

        long missing=(A+B)/2;
        long repeated=(A-B)/2;
        return new int[]{(int)missing,(int)repeated};
    }
}
