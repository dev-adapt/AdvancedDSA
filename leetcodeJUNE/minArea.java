package leetcodeJUNE;

import java.util.*;

public class minArea {
    public static int minimumArea(int[][] grid) {  
       HashSet<Integer>rows=new HashSet<>();
       HashSet<Integer>cols=new HashSet<>();
       int n=grid.length,m=grid[0].length;
       for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            int curr=grid[i][j];
            if(curr==1){
                rows.add(i);
                cols.add(j);
            }
        }
    }
        int minRow = Integer.MAX_VALUE;
        int maxRow = Integer.MIN_VALUE;

        // Iterate through the set to find min and max values
        Iterator<Integer> iterator = rows.iterator();
        while (iterator.hasNext()) {
            int current = iterator.next();
            if (current <minRow ) {
                minRow = current;
            }
            if (current > maxRow) {
                maxRow = current;
            }
        }
        int minCol = Integer.MAX_VALUE;
        int maxCol = Integer.MIN_VALUE;

        Iterator<Integer> iterator2 = cols.iterator();
        while (iterator2.hasNext()) {
            int current = iterator2.next();
            if (current <minCol ) {
                minCol = current;
            }
            if (current > maxCol) {
                maxCol = current;
            }
        }
        maxCol=maxCol+1;
        maxRow+=1;
      //  System.out.println(maxCol +" "+minCol+" "+maxRow +" "+minRow+" ");
        return (maxCol-minCol)*(maxRow-minRow);
    }
     
    public static void main(String[] args) {
        int[][]grid={{0,0},{1,0}};
        System.out.println(minimumArea(grid));
    }
}
