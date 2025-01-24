package leetcodeDECEMBER.ARRAYS2;

import java.util.ArrayList;
import java.util.Arrays;

public class mergeIntervals {
    //leetcode 56
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> {
            // Compare first column
            if (a[0] != b[0]) {
                return Integer.compare(a[0], b[0]);
            } else {
                // Compare second column if first column values are equal
                return Integer.compare(a[1], b[1]);
            }
        });
        ArrayList<int[]>list=new ArrayList<>();
        int idx=0,n=intervals.length,i=0;
        boolean flag=true;
        while(i<n){
            int[]arr=new int[2];
            arr[0]=intervals[i][0];
            arr[1]=intervals[i][1];
            while(i+1<n &&intervals[i+1][0]<arr[1] ){
                    arr[1]=Math.max(intervals[i+1][1],arr[1]);
                    i++;
               
            }
            list.add(arr);
        }
        int[][]ans=new int[list.size()][2];
        for(int j=0;j<ans.length;j++){
            ans[j][0]=list.get(j)[0];
            ans[j][1]=list.get(j)[1];
        }
        return ans;
    }
}
