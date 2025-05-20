package Year2025.leetcodeMay.DynamicProgramming;

import java.util.List;

public class Triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        int prev[]=new int[n];
        for(int i=0;i<n;i++)prev[i]=triangle.get(n-1).get(i);

        for(int i=n-2;i>=0;i--){
            int temp[]=new int[n];
            for(int j=i;j>=0;j--){
                int down=triangle.get(i).get(j)+prev[j];
                int diagonal=triangle.get(i).get(j)+prev[j+1];

                temp[j]=Math.min(down, diagonal);
            }
            prev=temp;
        }
        return prev[0];
    }
}
