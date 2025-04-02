package Year2025.leetcodeApril.GRAPHS;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class shortestDistanceInBinarymatrix {
    class tuple{
        int  dist,x, y;
        tuple( int dist,int x, int y){
            this.dist = dist;
            this.x = x;
            this.y = y;
           
        }
    }
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n=grid.length;
        if(n==1 && grid[0][0]==0)return 1;
        if(n==1 && grid[0][0]==1)return -1;
        if(grid[0][0]!=0 || grid[n-1][n-1]!=0)return -1;
        Queue<tuple>q=new LinkedList<>();
        int[][]dist=new int[n][n];
       for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            dist[i][j]=1000000;
        }
       }
        dist[0][0]=0;
        q.add(new tuple(1,0,0));
        int[]dr={-1,1,0,0,-1,-1,1,1};
        int[]dc={0,0,-1,1,-1,1,-1,1};
        while(!q.isEmpty()){
            tuple curr=q.poll();
            int dis=curr.dist;
            int r=curr.x;
            int c=curr.y;
            for(int i=0;i<8;i++){
                int nr=r+dr[i];
                int nc=c+dc[i];
                if(nr>=0&&nr<n&&nc>=0&&nc<n&&grid[nr][nc]==0 && dist[nr][nc]>dis+1){
                    dist[nr][nc]=dis+1;
                    if(nr==n-1 && nc==n-1)return dis+1;
                    q.add(new tuple(dis+1,nr,nc));
                }
            }
        }
        return -1;
    }
}
