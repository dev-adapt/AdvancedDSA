import java.util.ArrayList;

public class setMatrix {
    public void setZeroes(int[][] matrix) {
        ArrayList<ArrayList<Integer>>list=new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
               
                if(matrix[i][j]==0){
                    
                  ArrayList<Integer>entry=new ArrayList<>();
                    entry.add(i);
                    entry.add(j);
                    list.add(entry);
                }
            }
        }
int c=matrix[0].length,r=matrix.length;
        for(ArrayList<Integer> entry :list ){
            int entryRow=entry.get(0);
            int entryCol=entry.get(1);
            for(int col=0;col<c;col++){
                        matrix[entryRow][col]=0;
                    }
                    for(int row=0;row<r;row++){
                        matrix[row][entryCol]=0;
                    }
                 //  int entry[]=new int[2];
        }
    }
}
