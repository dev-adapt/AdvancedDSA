package Year2025.leetcodeJune.DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestDivisibleSubset {
      public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int dp[]=new int[n];
        Arrays.fill(dp,1);
        int hash[]=new int[n];
        for(int i=0;i<n;i++){
            hash[i]=i;
            for(int j=0;j<i;j++){
                if(nums[i]%nums[j]==0 && dp[i]< dp[j]+1 ){
                   dp[i]=1+dp[j];
                   hash[i]=j;
                }
            }
        }
        int ans=-1;
        int last=-1;
        for(int i=0;i<n;i++){
            if(dp[i]>ans){
                ans=dp[i];
                last=i;
            }
        }  
        List<Integer>temp=new ArrayList<>();
        temp.add(nums[last]);
        while(hash[last]!=last){
            last=hash[last];
            temp.add(nums[last]);
        }
        reverse(temp);
        return temp;
      }
      public void reverse(List<Integer>temp){
        int start=0,end=temp.size()-1;
        while(start<end){
            int t=temp.get(start);
            temp.set(start,temp.get(end));
            temp.set(end,t);
            start++;
            end--;
        }
      }
}
