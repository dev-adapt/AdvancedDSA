package leetcode;
import java.util.*;

public class largestPositiveIntegerWithNegative {
    static int findMax(int[]arr){
        int ans=-1;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i!=j && arr[i]+arr[j]==0){
                  if(ans<Math.abs(arr[i]))ans=Math.abs(arr[i]);
                }
            }
        }
        return ans;
    }
    static int findMax2(int[]nums){
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = n-1; i >= 0; i--) {
            if (nums[i] > 0 && Arrays.binarySearch(nums, -nums[i]) >= 0) {
                return nums[i];
            }
        }
        return -1; 
        }
    
    public static void main(String[] args) {
        int[]arr={-1,2,3,-3};
        System.out.println(findMax(arr));
        System.out.println(findMax2(arr));
    }
}
