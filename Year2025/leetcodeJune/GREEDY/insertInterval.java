package Year2025.leetcodeJune.GREEDY;

import java.util.*;

public class insertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        // Simulation doesn't work lol
        // We just merge the intervals
        ArrayList <int[]> ans = new ArrayList();

        // add the intervals before newInterval
        int i = 0;
        while (i < intervals.length && newInterval[0] > intervals[i][1]) {
            ans.add(intervals[i]);
            i++;
        }

        // merge all overlapping interval into newInterval
        while (i < intervals.length && newInterval[1] >= intervals[i][0]) {
            newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
            newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
            i++;
        }
        ans.add(newInterval);

        // add the remaining to answer
        while (i < intervals.length) {
            ans.add(intervals[i++]);
        }

        return ans.toArray(new int[ans.size()][2]);
    }
}
