package BINARY_SEARCH;
public class peakElementIn2Darray {
    public int[] findPeakGrid(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int low=0,high=m-1;
        while(low<=high){
            int mid = low + (high - low) / 2;

            int Row=maxRow(mat, n, m, mid);

            int left=mid-1>0?mat[Row][mid-1]:-1;
            int right=mid+1<m?mat[Row][mid+1]:-1;

            int curr=mat[Row][mid];

            if(curr>left && curr>right)return new int[]{Row,mid};
            else if(left>curr)high=mid-1;
            else low=mid+1;
        }
        return new int[]{-1,-1};
    }
    public int maxRow(int[][]mat,int n,int m,int mid){
        int maximum=-1,idx=-1;
        for(int i=0;i<n;i++){
            if(mat[i][mid]>maximum){
                maximum=mat[i][mid];
                idx=i;
            }
        }
        return idx;
    }
}
