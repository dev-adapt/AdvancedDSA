package leetcodeJUNE;
//523
public class goodSubarray {
    static boolean checkSubarraySum(int[] nums, int k) {
        if(nums.length==1 )return false;
        int sum[]=new int[nums.length];
        int n=sum.length;
        sum[0]=nums[0];
        for(int i=1;i<n;i++){
            sum[i]=sum[i-1]+nums[i];
        }
        if(n>1 && sum[n-1]==0)return true;
        for(int i=1;i<n;i++){
                if(sum[i]!=0 && sum[i]%k==0)return true;
                else{
                    for(int j=0;j<i-1;j++){
                        if((sum[i]-sum[j])%k==0)return true;
                }
            }
        }

        return false;
    }
    public static void main(String[] args) {
        int[]nums={0,0};
        int k=1;
        System.out.println(checkSubarraySum(nums, k));
    }
}
