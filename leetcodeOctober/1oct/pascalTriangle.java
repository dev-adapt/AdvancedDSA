//package leetcodeOctober.1oct;
import java.util.*;
public class pascalTriangle {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> allrows = new ArrayList<>();  // Initialize list of lists to store all rows
        for (int i = 0; i < n; i++) {
            List<Integer> row = new ArrayList<>();  // Initialize current row
            for (int j = 0; j <= i; j++) {
                // First and last elements in each row are always 1
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    // Sum of the two elements directly above in the previous row
                    int num1 = allrows.get(i - 1).get(j - 1);
                    int num2 = allrows.get(i - 1).get(j);
                    row.add(num1 + num2);
                }
            }
            allrows.add(row);  // Add the constructed row to all rows
        }
        return allrows;
    }
}
