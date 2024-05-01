package leetcode;
public class squareSameColor {
    static boolean squares(char[][]grid){
      
        for(int i=0;i<grid.length;i++){
           for( int j=0;j<grid[0].length-1;j++){
            if(grid[i][j]==grid[i][j+1]){
                // if(i-1>=0 &&i+1<grid.length && (grid[i-1][j]==grid[i][j]|| grid[i+1][j]==grid[i][j])){
                //     if(j+1<grid[0].length && j-1>=0 &&(grid[i-1][j+1]!=grid[i][j]|| grid[i+1][j+1]!=grid[i][j])) flag =true;
                //     else if(j+1<grid[0].length && j-1 >=0 &&(grid[i-1][j+1]==grid[i][j]|| grid[i+1][j+1]==grid[i][j])) flag =true;
                //     else if(j+1<grid[0].length && j-1 >=0 &&(grid[i-1][j+1]==grid[i][j]|| grid[i+1][j+1]==grid[i][j])) flag =true;

                // }
                if(i-1>=0 && grid[i-1][j]==grid[i][j] && (grid[i-1][j+1]==grid[i][j] ||grid[i-1][j+1]!=grid[i][j]  ))return true;
                else if(i+1<grid.length && grid[i+1][j]==grid[i][j] &&  (grid[i+1][j+1]==grid[i][j] ||grid[i+1][j+1]!=grid[i][j]  ))return true;
               else  if(i-1>=0 && j+1 <grid[0].length&& grid[i-1][j+1]==grid[i][j] && (grid[i-1][j]==grid[i][j] ||grid[i-1][j]!=grid[i][j]  ))return true;
               else if(i+1<grid.length && j-1 >=0&&grid[i+1][j-1]==grid[i][j] &&  (grid[i+1][j]==grid[i][j] ||grid[i+1][j]!=grid[i][j]  ))return true;
            }
           }
         
        }
        return false;
    }
    public static void main(String[] args) {
      char[][]  grid = {{'B','B','B'},{'W','W','B'},{'B','B','B'}};
      System.out.println(squares(grid));
    }
}
