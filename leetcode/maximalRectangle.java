package leetcode;


public class maximalRectangle {
    static void printing(int[][]matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
               System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
    static int maxRec(int[][]matrix){
        int ans=0;
        for(int i=1;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
               if(matrix[i][j]!=0 && matrix[i-1][j]!=0){
                matrix[i][j]+=matrix[i-1][j];
               }
            }
        }
       
        
        return ans;
    }
    public static void main(String[] args) {
       int[][] matrix = {{1,0,1,0,0},{1,0,1,1,1},{1,1,1,1,1},{1,0,0,1,0}};
       printing(matrix);
        System.out.println(maxRec(matrix));
        printing(matrix);
    }
}
