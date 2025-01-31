public class rowWithMaxOne {
   
        public int rowWithMax1s(int matrix[][]) {
            // code here
            int n = matrix.length;
            int m = matrix[0].length;
            int max = 0,row=-1;
            for(int i=0; i<n; i++){
                int count1 = 0;
                for(int j=0; j<m; j++){
                    if(matrix[i][j] == 1){
                        count1 = m - j;
                        break;
                    }
                }
                if(count1>max){
                    max=count1;
                    row=i;
                }
            }
            return row;
        }
    
}
