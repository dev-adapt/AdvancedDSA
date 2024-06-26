package leetcodeJUNE;

import java.util.Arrays;

public class minOperations {
    public static double minimumAverage(int[] nums) {
        int n=nums.length,j=n-1,i=0;
        Arrays.sort(nums);
        double min=Integer.MAX_VALUE;
      while(i<j){
            double curr=(double)(nums[i]+nums[j])/2.0;
            min=Math.min(min, curr);
            i++;
            j--;
        }
        return min;
    }
    public static void main(String[] args) {
        int nums[]={7,8,3,4,15,13,4,1};
        System.out.println(minimumAverage(nums));
    }
}
// prev=nums[i-1];
// prev=prev==0?;
// else prev=1;
// nums[i-1]=prev;
// curr=nums[i];
// if(curr==0)curr=1;
// else curr=0;
// nums[i]=curr;
// next=nums[i+1];
// if(next==0)next=1;
// else next=0;
// nums[i+1]=next;