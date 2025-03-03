package GRAPHS;
import java.util.*;
public class nearestCellWithZero {
    class triplet{
        int x, y, dist;
        public triplet(int x, int y, int dist){
            this.x = x;
            this.y = y;
            this.dist = dist;
        }
    }
    public int[][] updateMatrix(int[][] mat) {
        int n=mat.length,m=mat[0].length;
        int[][]dis=new int[n][m];
        int[][]vis=new int[n][m];
        Queue<triplet> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==0){
                    vis[i][j]=1;
                    q.add(new triplet(i, j, 0));
                }
                else vis[i][j]=0;
            }
        }
        int dRow[]={-1,1,0,0};
        int dCol[]={0,0,1,-1};
        while(!q.isEmpty()){
            triplet t=q.poll();
            int row=t.x,col=t.y,steps=t.dist;
            dis[row][col]=steps;
            for(int i=0;i<4;i++){
                int nrow=row+dRow[i];
                int ncol=col+dCol[i];
                if(nrow>=0&&nrow<n && ncol>=0&&ncol<m &&vis[nrow][ncol]==0 && mat[nrow][ncol]==1){
                    vis[nrow][ncol]=1;
                    q.add(new triplet(nrow, ncol, steps+1));
                }
            }
        }
       

        return dis;
    }
}
