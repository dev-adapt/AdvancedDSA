package leetcode;

public class sudoku {
    public boolean isSafe(char[][]board,int row,int col ,int num){
        for(int i=0;i<board.length;i++){
            //checking for rows
            if(board[i][col]==(char)(num+'0'))return false;
            //checking for columns
            if(board[row][i]==(char)(num+'0'))return false;
        }
         //checking for grid
    int sr=(row/3)*3,sc=(col/3)*3;
    for(int i=sr;i<sr+3;i++){
        for(int j=sc;j<sc+3;j++){
            if(board[i][j]==(char)(num+'0'))return false;
        }
    }
    return true;
    }
   public boolean helper(char[][]board,int row,int col){
    if(row==board.length)return true;
    int nrow=0,ncol=0;
    if(col!=board.length-1){
        nrow=row;
        ncol=col+1;
    }else{
        nrow=row+1;
        ncol=0;
    }
    if(board[row][col]!='.'){
        if(helper(board, nrow, ncol))return true;
    }else{
        for(int i=1;i<=9;i++){
            if(isSafe(board, row, col, i)){
                board[row][col]=(char)(i+'0');
                if(helper(board, nrow, ncol))return true;
                else board[row][col]='.';
            }
       }
    }
    return false;
   }
   public void solveSudoku(char[][]board){
    helper(board, 0, 0);
   }
}
