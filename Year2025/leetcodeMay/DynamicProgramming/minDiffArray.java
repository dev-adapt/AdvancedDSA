package Year2025.leetcodeMay.DynamicProgramming;



public class minDiffArray {
    public int minimumDifference(int[] nums) {
        int sum=0;
        int n=nums.length;
        for(int i=0;i<n;i++)sum+=nums[i];
         boolean[]prev=new boolean[sum+1];
        
        prev[0]=true;
        prev[nums[0]]=true;
         boolean[]curr=new boolean[sum+1];
            curr[0]=true;
        for(int i=1;i<n;i++){
           
            for(int target=1;target<=sum;target++){
                boolean notTake=prev[target];
                boolean take=false;
                if(nums[i]<=target){
                  take=  prev[target-nums[i]];
                }
                curr[target]=notTake||take;
            }
            prev=curr;
        }
        int mini=Integer.MAX_VALUE;

        for(int i=0;i<=sum;i++){
            if(prev[i]==true){
                mini=Math.min(mini,Math.abs(sum-2*i));
            }
        }
        return mini;
    }
}
