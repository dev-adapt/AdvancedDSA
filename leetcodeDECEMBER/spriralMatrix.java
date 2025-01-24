package leetcodeDECEMBER;

import java.util.ArrayList;
import java.util.List;

public class spriralMatrix {
     public List<Integer> spiralOrder(int[][] matrix) {
        int topRow=0,leftCol=0,bottomRow=matrix.length,rightCol=matrix[0].length;
        int r=matrix.length,c=matrix[0].length;
        List<Integer>ls=new ArrayList<>();
        int totalElements=0;
        while(totalElements < r*c){
            //for topRow
            for(int j=leftCol;j<rightCol && totalElements <r*c ;j++){
                ls.add(matrix[topRow][j]);
                totalElements++;
            }
            topRow++;
           

            // for rightCol

            for(int i=topRow;i<bottomRow && totalElements <r*c ;i++){
                ls.add(matrix[i][rightCol]);
                totalElements++;
            }
            rightCol--;
           
            //for bottomRow

            for(int j=rightCol-1;j>=leftCol && totalElements <r*c;j--){
                ls.add(matrix[bottomRow-1][j]);
                totalElements++;
            }
            bottomRow--;
           

            //for leftCol
            for(int i=bottomRow-1;i>=topRow && totalElements <r*c;i--){
                ls.add(matrix[i][leftCol]);
                totalElements++;
            }
            leftCol++;
        }
        return ls;
    }
}
