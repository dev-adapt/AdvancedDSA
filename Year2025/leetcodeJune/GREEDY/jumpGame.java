package Year2025.leetcodeJune.GREEDY;

public class jumpGame {
    public boolean canJump(int[] nums) {
         int maxi=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==0)continue;
             int curr=i+nums[i]; 
            if(maxi>=i) maxi=Math.max(maxi, curr);
        }
        return maxi>=n-1; 
    }
}
