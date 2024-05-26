package leetcode;

public class goodPairs2 {
    static int goodPair(int[] nums1, int[] nums2, int k){
       int ans=0;
       for(int i=0;i<nums2.length;i++){
        nums2[i]=nums2[i]*k;
       }
       for(int i=0;i<nums1.length;i++){
        for(int j=0;j<nums2.length;j++){
           if(nums2[j]<=nums1[i]){
                if(nums1[i]%nums2[j]==0)ans++;
           }
        }
    }
        return ans;
    }
    public static void main(String[] args) {
        int nums1[]={1,2,4,12};
        int nums2[]={2,4};
        int k=3;
        System.out.println(goodPair(nums1, nums2, k));
    }
}
