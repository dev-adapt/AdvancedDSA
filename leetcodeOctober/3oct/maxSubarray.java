import java.util.*;

public class maxSubarray {
    public static int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i:nums)if(i>max)max=i;
        List<Integer>list=new ArrayList<>();

        for(int j=0;j<n-1;j++){
            int curr=nums[j]+nums[j+1];
            System.out.print(curr);
            if(curr>max)max=curr;
            list.add(curr);
            
        }
        System.out.println(max);
        System.out.println();
        for(int i=2;i<n;i++){
            for(int j=0;j<n-i;j++){
                int curr=list.get(j)+nums[j+i];
                list.add(j,curr);
                System.out.print(curr);
                if(curr>max)max=curr;
            }
            System.out.println();
            System.out.println(max);
            System.out.println();
        }
        return max;
    }
    public static void main(String[] args) {
       int[] nums = {8,-19,5,-4,20};
       System.out.println(maxSubArray(nums));
    }
}
