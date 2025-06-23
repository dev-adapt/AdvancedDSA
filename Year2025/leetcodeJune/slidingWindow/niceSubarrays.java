public class niceSubarrays {
       public int numberOfSubarrays(int[] nums, int k) {
        return f(nums,k)-f(nums,k-1);
    }
    private int f(int nums[],int k){
         int n=nums.length;
        int l=0,r=0,res=0,count=0;
        while(r<n){
            if((nums[r]&1)==1)count++;
            while(count>k){
                if((nums[l]&1)==1)count--;
                l++;
            }
            res+=r-l+1;
            r++;
        }
        return res;
    }
}
