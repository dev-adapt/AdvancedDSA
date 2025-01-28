import java.util.*;


public class fourSumProblem {
     public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>>list=new ArrayList<>();
        
        if(target>1e9 || target < -1e9)return list;
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(i!=0 && nums[i]==nums[i-1])continue;
           for( int j=i+1;j<n;j++){
            if(j>i+1 && nums[j]==nums[j-1])continue;
               int k=j+1;
               int l=n-1;
               while(k<l){
                long sum = (long) nums[i] + nums[j] + nums[k] + nums[l]; 
                    if(sum<target){
                        k++;
                    }else if(sum>target){
                        l--;
                    }else if(sum==target){
                       // System.out.println(sum);
                        list.add(Arrays.asList(nums[i],nums[j],nums[k],nums[l]));
                        k++;
                        l--;
                        while(k<l && nums[k]==nums[k-1])k++;
                        while(k<l && nums[l]==nums[l+1])l--;
                    }
               }
           }

        }
        return list;
    }
    public static void main(String[] args) {
        int[] nums={1000000000,1000000000,1000000000,1000000000};
        int target=-294967296;
        List<List<Integer>> ans=fourSum(nums, target);
        System.out.println(
            ans
        );
    }
}
