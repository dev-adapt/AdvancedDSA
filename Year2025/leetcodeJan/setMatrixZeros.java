import java.util.*;
public class setMatrixZeros {
    public void setZeroes(int[][] matrix) {
        Stack <Integer> row = new Stack<>();
        Stack <Integer> col = new Stack<>();

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == 0){
                    row.push(i);
                    col.push(j);
                }
            }
        }
        while(!row.isEmpty()){
            int r = row.pop();
            for(int j=0;j<matrix[0].length;j++){
                matrix[r][j] = 0;
            }
        }
        while(!col.isEmpty()){
            int c=col.pop();
            for(int i=0;i<matrix.length;i++){
                matrix[i][c] = 0;
            }
        }
        
    }
}
