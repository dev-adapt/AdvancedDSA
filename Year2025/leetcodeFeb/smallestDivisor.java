public class smallestDivisor {
    public int smallestDivisor(int[] nums, int threshold) {
        int low=1,high=1000000;
        while(low<=high){
            int mid=(low+high)/2;
            int ans=isPossible(nums, threshold, mid);
            if(ans==0){
                low=mid+1;
            }else high=mid-1;
        }
        return low;
    }
    public int isPossible(int[]nums,int threshold,int divisor){
        double temp=0;
        for(int i=0;i<nums.length;i++){
            double curr=(double)nums[i]/(double)divisor;
           temp+= Math.ceil(curr);
        }
        return( temp>threshold)?0:1;
    }
    public static void main(String[] args) {
        int n=7,m=3;
        double curr=(double)n/(double)m;
       
        System.out.println( curr+" "+Math.ceil(curr));
    }
}
