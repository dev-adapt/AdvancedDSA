public class sortColors {
    public void sortColor(int[] nums) {
       int one=0,two=0,zero=0;
       for(int i:nums){
        if(i==0)zero++;
        else if(i==1)one++;
        else two++;
       }
       int idx=0;
       for(int i=0;i<nums.length;i++){
        while(zero!=0)nums[idx++]=0;
        while(one!=0)nums[idx++]=1;
        while(two!=0)nums[idx++]=2;
       }
    }
}
