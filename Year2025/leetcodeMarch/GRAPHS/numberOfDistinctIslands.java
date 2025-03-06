package GRAPHS;

public class numberOfDistinctIslands {
    public static int countDistinctIslands(int[][]grid){
        int dRow[]={-1,1,0,0};
        int dCol[]={0,0,1,-1};
        int n=grid.length,m=grid[0].length;
        int[][]vis=new int[n][m];

        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1 && vis[i][j]==0){
                    count++;
                    dfs(i,j,dRow,dCol,grid,vis,n,m);
                }
            }
        }
        return count;
    }
    private static void dfs(int row,int col,int []dRow,int[]dCol,int[][]grid, int[][]vis,int n,int m){
        vis[row][col]=1;
        for(int i=0;i<4;i++){
            int newRow=row+dRow[i];
            int newCol=col+dCol[i];

            if(newRow>=0 && newRow<n && newCol>=0 && newCol<m && grid[newRow][newCol]==1 && vis[newRow][newCol]==0 ){
                dfs(newRow, newCol, dRow, dCol, grid, vis, n, m);
            }
        }
    }
    public static void main(String[] args) {
        int[][] grid = {{1,1,0,1,1},
                        {1,0,0,0,0},
                        {0,0,0,0,1},
                        {1,1,0,1,1}
                    };
        System.out.println(countDistinctIslands(grid));
                        
    }
}
