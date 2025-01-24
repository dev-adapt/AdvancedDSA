public class rearrangeArray {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        int odd=1,even=0;
        for(int i=0;i<n;i++){
            if(nums[i]>=0){
                ans[even]=nums[i];
                even+=2;
            }else{
                ans[odd]=nums[i];
                odd+=2;
            }
        }
        return ans;
    }
}

