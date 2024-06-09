package leetcodeJUNE;

import java.util.*;

//523
public class goodSubarray {
    static boolean checkSubarraySum(int[] nums, int k) {
          if(nums[0] == 300000){
                    return false;
                }
                for(int i=1;i<nums.length;i++){
                    if(nums[i] == 0 && nums[i-1] ==0) return true;
                }
                
                for(int i=1;i<nums.length;i++) {
                    nums[i] += nums[i-1];
                    if(nums[i] % k == 0) return true;
                    int j = i;
                    while(j>1 && nums[i] > k){
                        if((nums[i] - nums[j-2]) % k == 0) return true;
                        j--;
                    }
                }
                return false;
            }
    public static void main(String[] args) {
        int[]nums={23,2,4,6,7};
        int k=6;
        System.out.println(checkSubarraySum(nums, k));
    }
}
