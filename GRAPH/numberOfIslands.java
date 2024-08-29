package GRAPH;

import java.util.LinkedList;
import java.util.Queue;
class pair{
    int first;
    int sec;
    public pair(int first,int sec){
        this.first=first;
        this.sec=sec;
    }
}
public class numberOfIslands {
    private static void bfs(int ro,int co,int[][]vis,char [][]grid){
        vis[ro][co]=1;
        Queue<pair>q=new LinkedList<pair>();
        q.add(new pair(ro,co));
        int n=grid.length,m=grid[0].length;
        while(!q.isEmpty()){
            int row=q.peek().first;
            int col=q.peek().sec;
            q.remove();
            for(int delrow=-1;delrow<=1;delrow++){
                for(int delcol=-1;delcol<=1;delcol++){
                    int nrow=row+delrow;
                    int ncol=col+delcol;
                    if(nrow>=0 && nrow<n &&ncol>=0 && ncol<m && grid[nrow][ncol]=='1' && vis[nrow][ncol]==0){
                        vis[nrow][ncol]=1;
                        q.add(new pair(nrow, ncol));
                    }
                }
            }
        }
    }
    public static int numIslands(char[][] grid) {
        // Code here
        int n=grid.length,m=grid[0].length;
        int[][] vis=new int[n][m];
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(vis[i][j]==0 && grid[i][j]=='1'){
                    count++;
                    bfs(i,j,vis,grid);
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        char[][] grid = {{0,1,1,1,0,0,0},{0,0,1,1,0,1,0}};
        System.out.println(numIslands(grid));
    }
}
