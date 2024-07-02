package LeetcodeJuly;

import java.util.ArrayList;


public class intersectionTwoArray {
    public static int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer>list=new ArrayList<>();
        // HashMap<Integer,Integer>mp1=new HashMap<>();
        // HashMap<Integer,Integer>mp2=new HashMap<>();
        // for(int i:nums1)mp1.put(i,mp1.getOrDefault(i,0)+1);
        // for(int i:nums2)mp2.put(i,mp2.getOrDefault(i,0)+1);
        int arr1[]=new int[1001];
        int arr2[]=new int[1001];
        for(int i:nums1)arr1[i]++;
        for(int i:nums2)arr2[i]++;
        for(int i=0;i<1001;i++){
            int min=1001;
            min=arr1[i]<arr2[i]?arr1[i]:arr2[i];
            for(int j=0;j<min;j++)list.add(i);
        }
        int ans[]=new int[list.size()];
        int k=0;
        for(int i:list)ans[k++]=i;
        return ans;
    }
    public static void main(String[] args) {
        int nums1[]={1,2,2,1},nums2[]={2,2};
        int ans[]=intersect(nums1, nums2);
        for(int i:ans)System.out.print(i);
        System.out.println();
    }
}
