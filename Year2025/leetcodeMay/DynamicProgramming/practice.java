package Year2025.leetcodeMay.DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class practice {
    public int maxSubstrings(String word) {
             int n = word.length();
        int[] first = new int[26];
        int[] last = new int[26];
        Arrays.fill(first, -1);

      
        for (int i = 0; i < n; i++) {
            int idx = word.charAt(i) - 'a';
            if (first[idx] == -1) first[idx] = i;
            last[idx] = i;
        }

        List<int[]> list = new ArrayList<>();

        for (int ch = 0; ch < 26; ch++) {
            if (first[ch] == -1) continue;
            int start = first[ch];
            int end = last[ch];
            boolean valid = true;

            for (int i = start; i <= end; i++) {
                int c = word.charAt(i) - 'a';
                if (first[c] < start || last[c] > end) {
                    valid = false;
                    break;
                }
            }

            if (valid && end - start + 1 >= 4 && word.charAt(start) == word.charAt(end)) {
                list.add(new int[]{start, end});
            }
        }

        list.sort(Comparator.comparingInt(a -> a[1]));

        int count = 0, lastEnd = -1;
        for (int[] arr : list) {
            if (arr[0] > lastEnd) {
                count++;
                lastEnd = arr[1];
            }
        }

        return count;
    }
}
