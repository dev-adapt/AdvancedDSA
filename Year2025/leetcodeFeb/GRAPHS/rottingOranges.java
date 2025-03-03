package GRAPHS;

import java.util.*;

class pair{
    int first;
    int sec;
    int t;
    public pair(int first,int sec,int t){
        this.first=first;
        this.sec=sec;
        this.t=t;
    }
}
public class rottingOranges {
    public int orangesRotting(int[][] grid) {
        int n=grid.length,m=grid[0].length;
        int vis[][]=new int[n][m];
        int cntFresh=0;
        Queue<pair>q=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    q.add(new pair(i,j,0));
                    vis[i][j]=2;
                }else if(grid[i][j]==1){
                    cntFresh++;
                    vis[i][j]=1;
                }else vis[i][j]=0;
            }
        }
        int tm=0;
        int dRow[]={-1,1,0,0};
        int dCol[]={0,0,-1,1};
        int cnt=0;
        while(!q.isEmpty()){
            int r=q.peek().first;
            int c=q.peek().sec;
            int t=q.peek().t;
            tm=Math.min(tm, t);
            q.poll();
            cnt++;

            for(int i=0;i<4;i++){
                int row=r+dRow[i];
                int col=c+dCol[i];
                if(row>=0&&row<n&&col>=0&&col<m&&grid[row][col]==1 && vis[row][col]==1){
                    q.add(new pair(row,col,t+1));
                    vis[row][col]=2;
                    grid[row][col]=2;
                }
            }
        }
        return cnt==cntFresh?tm:-1;
    }
}
