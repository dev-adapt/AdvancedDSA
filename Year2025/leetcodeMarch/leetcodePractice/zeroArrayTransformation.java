// package leetcodePractice;
public class zeroArrayTransformation {
    public int minZeroArray(int[] nums, int[][] queries) {
        int []count=new int[1];
       
        int n=nums.length;
        count[0]=numberOfZeros(nums);
          if(count[0]==n)return 0;
        for(int i=0;i<queries.length;i++){
            int st=queries[i][0];
            int end=queries[i][1];
            int val=queries[i][2];
           
           changeValues(st, end, val,count, nums);
           if(count[0]==n)return i+1;
        }
       return -1;
    }
    public void changeValues(int st,int end,int val,int []count,int[] nums){
        for(int i=st;i<=end;i++){
            if(nums[i]>=val){
                nums[i]-=val;
                if (nums[i] == 0) count[0]++;
                }
            else if(nums[i]!=0 && nums[i]<val){
              nums[i]=0;
              count[0]++;
            }
        }
    }
    public int numberOfZeros(int[]nums){
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)count++;
        }
        return count;
    }
}
