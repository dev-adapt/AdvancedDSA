package Year2025.leetcodeJune.GREEDY;

import leetcodeJUNE.sortColor;

public class jumpGameTwo {
    public static int jump(int[] nums) { //2,3,1,1,4
        int count=0;
        int n=nums.length;
        int farthest=0;
        int l=1,r=nums[0];
        while(l<n-1 && r<n){
           for(int i=l;i<=r;i++){
            if(nums[i]+i>farthest){
                farthest=nums[i]+i;
                count++;
            }
            l=r+1;
            r=farthest;
           }
        }
        return count;
    }
    public static void main(String[] args) {
        int nums[]={2,3,1,1,4};
        System.out.println(jump(nums));
    }
}
