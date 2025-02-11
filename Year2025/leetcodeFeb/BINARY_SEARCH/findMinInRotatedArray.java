package BINARY_SEARCH;
public class findMinInRotatedArray {
    public int findMin(int[] nums) {
        int st=0,end=nums.length-1;
        int ans=Integer.MAX_VALUE;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(nums[mid]<nums[end]){ //right half is sorted
                ans=Math.min(ans, nums[mid]);
                end=mid-1;
            }else{ //left half of the array is sorted
                ans=Math.min(ans, nums[st]);
                st=mid+1;
            }
        }
        return ans;
    }
}
