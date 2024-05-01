package leetcode;

public class rightTriangle {
    static long triangle(int[][]grid){
        long ans=0,edge=0;
        int row=grid.length,col=grid[0].length;
        for(int i=0;i<grid.length;i++){

            for( int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1 &&j+1<col&& grid[i][j+1]==1 && i+1<row &&grid[i+1][j]==1 )ans+=1;
                if(grid[i][j]==1 &&i+1<row&& grid[i+1][j]==1  &&grid[i][col-1]==1 &&col-1!=j)ans+=1;

                if(grid[i][j]==1 &&j+1<col&& grid[i][j+1]==1 && i+1<row &&grid[i+1][j+1]==1 )ans+=1;
                if(grid[i][j]==1 &&j+1<col&& grid[i][j+1]==1  &&grid[row-1][j]==1 &&row-1!=i)ans+=1;

                if(grid[i][j]==1 &&j+1<col&& i+1<row && grid[i+1][j]==1 && grid[i+1][j+1]==1 )ans+=1;
                if(grid[i][j]==1 &&j+1<col&& i+1<row && grid[i+1][j]==1 && grid[i+1][col-1]==1 &&col-1!=j )ans+=1;

                if(j+1<col&& i+1<row && grid[i][j+1]==1 && grid[i+1][j+1]==1 && grid[i+1][j]==1 )ans+=1;
                if(j+1<col&& i+1<row && grid[i][j+1]==1 && grid[i+1][j+1]==1 && grid[i+1][0]==1 && j!=0)ans+=1;
            }
        }
        

        if(grid[0][0]==1)edge+=1;
        if(grid[0][col-1]==1)edge+=1;
        if(grid[row-1][col-1]==1)edge+=1;
        if(grid[row-1][0]==1)edge+=1;
        if(edge==3)ans+=1;
        return ans;
    }
    public static void main(String[] args) {
       int[][] grid = {{0,1,0},{0,1,1},{0,1,0}};
       System.out.println(triangle(grid));
    }
}
