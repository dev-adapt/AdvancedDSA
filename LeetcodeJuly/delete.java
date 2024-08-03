import java.util.*;


public class delete{
    public int minimumCost(int m, int n, int[] x, int[] y) {
        // ArrayList<Integer>x=new ArrayList<>();
        // for(int i:horizontalCut)x.add(i);
        // ArrayList<Integer>y=new ArrayList<>();
        // for(int i:verticalCut)x.add(i);
        // x.sort(Comparator.reverseOrder());
        // y.sort(Comparator.reverseOrder());
        // int verticalPieces=1,horizontalPieces=1;
        // int totalCost=0;
        // int i=0,j=0;
        // while(i<m-1&&j<n-1){
        //     if(x.get(i)>y.get(j)){
        //         totalCost+=x.get(i)*horizontalPieces;
        //         verticalPieces++;
        //         i++;
        //     }else{
        //         totalCost+=y.get(i)*verticalPieces;
        //         horizontalPieces++;
        //         j++;
        //     }
        // }
        // if(i<m-1){
        //     totalCost+=x.get(i)*horizontalPieces;
        //     i++;
        // }else if(j<n-1){
        //     totalCost+=y.get(j)*verticalPieces;
        //     j++;
        // }
        // return totalCost;
        Arrays.sort(x);
        Arrays.sort(y);
        int i=x.length-1;
        int j=y.length-1;
        int row=1,col=1;
        int ans=0;
        while(i>=0 || j>=0){
            int a=i>=0?x[i]:-1;
            int b=j>=0?y[j]:-1;
            if(a>=b){
                ans+=(a*row);
                col++;
                i--;
            }else{
                ans+=(b*col);
                row++;
                j--;
            }
        }
        return ans;
    }
}


