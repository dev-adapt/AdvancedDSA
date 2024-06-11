package leetcodeJUNE;

import java.util.Arrays;

public class height {
    static int heightChecker(int[] heights) {
     int arr[]=heights.clone();
      Arrays.sort(heights);
      int ans=0;
        for(int i=0;i<heights.length;i++){
            if(arr[i]!=heights[i])ans++;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] heights = {1,1,4,2,1,3};
        System.out.println(heightChecker(heights));
    }
}
