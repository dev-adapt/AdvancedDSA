public class maxConsecutive {
     public int longestOnes(int[] nums, int k) {
        int maxLen=0,l=0,r=0,zeros=0;
        int n=nums.length;
        while(r<n){
            if(nums[r]==0)zeros++;
            while(zeros>k){
                if(nums[l]==0)zeros--;
                l++;
            }
            if(zeros<=k){
                int len=r-l+1;
                maxLen=Math.max(maxLen, len);
            }
            r++;
        }
        return maxLen;
    }
}
