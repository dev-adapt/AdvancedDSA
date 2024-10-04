import java.util.*;

public class nextPermutation{
    static void permutation(int[] nums) {
     //  int []arr=nums.clone();
       int n=nums.length;
       int idx=-1;
        for(int i=n-2;i>=0;i--){
          if(nums[i]<nums[i+1]){
            idx=i;
            break;
          }
        }
        if(idx==-1){
            Arrays.sort(nums);
            return;
        }
            for(int i=n-1;i>idx;i--){
                if(nums[i]>nums[idx]){
                    int temp=nums[idx];
                    nums[idx]=nums[i];
                    nums[i]=temp;
                    break;
                }
            }
            int j=n-1;
            idx++;
            while(idx<j){
                int temp=nums[idx];
                nums[idx]=nums[j];
                nums[j]=temp;
                idx++;
                j--;
            }
        
    }
   public static void main(String[] args) {
    int nums[]={3,1,2};
    permutation(nums);
    for(int i=0;i<nums.length;i++)System.out.println(nums[i]);
   }
}