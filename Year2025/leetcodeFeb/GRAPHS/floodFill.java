package GRAPHS;

public class floodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int dRow[]={-1,1,0,0};
        int dCol[]={0,0,-1,1};
        int n=image.length,m=image[0].length;
        int[][]vis=new int[n][m];
        int oldColor=image[sr][sc];
        dfs(image, sr, sc, color,oldColor, n, m, vis, dRow, dCol);
        return image;

    }
    void dfs(int[][] image, int sr, int sc, int newColor,int oldColor,int n,int m,int [][]vis,int []dRow,int[]dCol){
       
        image[sr][sc]=newColor;
        vis[sr][sc]=1;

        for(int i=0;i<4;i++){
            int r=sr+dRow[i];
            int c=sc+dCol[i];
            if(r>=0 && r<n && c>=0 && c<m && image[r][c]==oldColor &&vis[r][c]==0){
                dfs(image, r, c, newColor, oldColor, n, m, vis, dRow, dCol);
            }
        }

    }
}
