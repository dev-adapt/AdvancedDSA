package leetcode;

public class minNumberOperations {
    static int minOperation(int[][]grid){
        int ans=0;
        for(int i=0;i<grid.length-1;i++){
            for(int j=0;j<grid[0].length-1;j++){
                if(grid[i][j]!=grid[i+1][j]){grid[i+1][j]=grid[i][j];
                ans+=1;
            }if(grid[i][j]==grid[i][j+1]){
                
            }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
       int[][]grid= {{1,0,2},{1,0,2}};
       System.out.println(minOperation(grid));
    }
}
