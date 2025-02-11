package BINARY_SEARCH;
public class paintersPartition  {
    public int splitArray(int[] nums, int k) {
        int low=Integer.MAX_VALUE,high=nums[0];
        int n=nums.length;
        for(int i=0;i<n;i++){
            low=Math.min(low,nums[i]);
          high+=nums[i];
        }
        while(low<=high){
            int mid=(low+high)/2;
            if(partitions(nums, mid, k))low=mid+1;
            else high=mid-1;
        }
        return low;
    }
    public boolean partitions(int[]nums,int mid,int k){
        int n=nums.length;
        int subSum=0;
        int count=0;
        for(int i=0;i<n;i++){
            if(subSum+nums[i]<=mid){
                subSum+=nums[i];
            }else{
                count++;
                subSum=nums[i];
            }
            if(count>k)return false;
        }
        return true;
    }
}
