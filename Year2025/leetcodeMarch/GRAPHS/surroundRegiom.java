package GRAPHS;

import java.util.Arrays;

public class surroundRegiom {
    public void solve(char[][] board) {
        int dRow[]={-1,1,0,0};
        int dCol[]={0,0,1,-1};
        int n=board.length,m=board[0].length;
        int[][]vis=new int[n][m];
       // Arrays.fill(vis,0);
        //checking first and last row
        for(int j=0;j<m;j++){
            if(board[0][j]=='O'&& vis[0][j]==0){
                dfs(0, j, vis, dRow, dCol, board, n, m);
            }
       
            if(board[n-1][j]=='O'&& vis[n-1][j]==0){
                dfs(n-1, j, vis, dRow, dCol, board, n, m);
            }
        }
        //checking first and last column
        for(int i=0;i<n;i++){
            if(board[i][0]=='O'&& vis[i][0]==0){
                dfs(i, 0, vis, dRow, dCol, board, n, m);
            }
       
            if(board[i][m-1]=='O'&& vis[i][m-1]==0){
                dfs(i, m-1, vis, dRow, dCol, board, n, m);
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]=='O' && vis[i][j]==0)board[i][j]='X';
            }
        }

    }
    public void dfs( int row,int col,int[][]vis,int []dRow,int[]dCol,char[][] board,int n,int m){
        vis[row][col]=1;
        for(int i=0;i<4;i++){
            int nrow=row+dRow[i];
            int ncol=col+dCol[i];
            if(nrow>=0&&nrow<n && ncol>=0 &&ncol<m && vis[nrow][ncol]==0 && board[nrow][ncol]=='O'){
                dfs(nrow, ncol, vis, dRow, dCol, board, n, m);
            }
        }
    }
}
