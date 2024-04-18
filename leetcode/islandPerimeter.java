package leetcode;

public class islandPerimeter {
    static int perimeteer(int[][]arr){
        int peri=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==1){
                    peri+=4;
                    if(i>0&&arr[i-1][j]==1)peri-=1;//up
                    if(i<arr.length-1&& arr[i+1][j]==1)peri-=1;//down
                    if(j>0&&arr[i][j-1]==1)peri-=1;//left
                    if(j<arr[0].length-1&& arr[i][j+1]==1)peri-=1;//right
                }           
            }
        }
        return peri;
    }
    public static void main(String[] args) {
        int[][] grid={{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
        System.out.println(perimeteer(grid));
    }
}
