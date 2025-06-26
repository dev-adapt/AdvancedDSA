package Year2025.leetcodeJune.GREEDY;

import java.util.Arrays;

public class nonOverlapping {
    public int eraseOverlapIntervals(int[][] intervals) {
         Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[2])); //[[1,2],[2,3],[3,4],[1,3]]
         int count = 0;
         int n=intervals.length;
         int end=intervals[0][1];
         for(int i=1;i<n;i++){
            if(intervals[i][0]>=end){
                end=intervals[i][1];
            }else count++;
         }
         return count;
    }
}
