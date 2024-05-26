package leetcode;
public class goodPair1 {
    static int goodPair(int[] nums1, int[] nums2, int k){
        int ans=0;
        for(int i=0;i<nums2.length;i++){
            int num=nums2[i]*k;
            for(int j=0;j<nums1.length;j++){
                if( nums1[j]%num==0){ans++;
                System.out.println(i+" "+j);}
               
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
