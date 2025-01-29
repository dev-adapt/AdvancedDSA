import java.util.ArrayList;
import java.util.Arrays;


public class mergeOverlapingSubintervals {
    public int[][] merge(int[][] intervals) {
        // Step 1: Sort intervals by the start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        ArrayList<int[]> list = new ArrayList<>();
        int n = intervals.length;
        int i = 0;

        // Step 2: Traverse and merge intervals
        while (i < n) {
            int[] arr = new int[2];
            arr[0] = intervals[i][0];
            arr[1] = intervals[i][1];

            // Merge overlapping intervals
            while (i + 1 < n && intervals[i + 1][0] <= arr[1]) {
                arr[1] = Math.max(arr[1], intervals[i + 1][1]);
                i++;
            }

            list.add(arr);
            i++; // Move to the next unprocessed interval
        }

        // Step 3: Convert list to array
        return list.toArray(new int[list.size()][]);
    }
}
