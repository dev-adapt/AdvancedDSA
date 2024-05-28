package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class specialArrayWithX {
    static  int specialArray(int[] nums) {
        int ans=-1;
        Arrays.sort(nums);
        ArrayList<Integer>list=new ArrayList<Integer>();
        ArrayList<Integer>list2=new ArrayList<Integer>();
        int idx=0;
      while(idx<nums.length){
        int curr=nums[idx];
        int count=1;
        for(int i=idx;i<nums.length;i++){
            if(curr==nums[i]){
                count++;
            }
            list2.add(curr);
            idx+=count;
            list.add(count);
        }
        int n1=list.size();
        int n2=list2.size();
        for(int i=n1-2;i>0;i++){
            list.
        }
    }
        return ans;
    }
    public static void main(String[] args) {
        int[]nums={0,4,3,0,4};
        System.out.println(specialArray(nums));
    }
}
