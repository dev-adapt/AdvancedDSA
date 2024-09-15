package leetcodeAugustAndSeptember;

public class longestSubarray {
    public static int longestSubarray(int[] nums) {
        int max=0,count=1,count2=1;
        int ans=0,ans2=0,len=nums.length;
        for(int i=0;i<len;i++){
            int curr=nums[i];
            if(curr>max){
                max=curr;
                int idx=i+1;
                while(idx<len &&nums[idx]==curr){
                    idx++;
                    count++;
                    System.out.println(max+" "+count+"len"+len);
                }
                ans=idx-i;
            }else if(curr==max){
                int idx=i+1;
                while(idx<len &&nums[idx]==max){
                    idx++;
                    count2++;
                    System.out.println(max+" count2: "+count2+"idx: "+idx);
                }
                ans2=idx-i;
            }
            ans=Math.max(ans2, ans);
           
        }
        return ans;
        /*
               int len = 1;

        // Step 1: Find the maximum element in the array
        int mx = Integer.MIN_VALUE;
        for (int num : nums) {
            mx = Math.max(mx, num);  // O(n)
        }

        // Step 2: Find the longest subarray consisting of the maximum element
        int tmp_len = 0;
        for (int num : nums) {  // O(n)
            if (num == mx) {
                tmp_len++;
            } else {
                len = Math.max(len, tmp_len);
                tmp_len = 0;
            }
        }

        // Update len in case the longest subarray is at the end
        len = Math.max(len, tmp_len);

        return len;
         */
    }
    public static void main(String[] args) {
        int nums[]={586730,586730,67,586730,586730,586730,586730};
         System.out.println(longestSubarray(nums));
    }
}
