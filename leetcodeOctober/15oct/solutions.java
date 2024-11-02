//package leetcodeOctober.15oct;
import java.util.*;
class solutions {
    public static long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i:nums)maxHeap.add(i);
        long ans=0;
        for(int i=0;i<k;i++){
           int curr= maxHeap.poll();
           System.out.print(curr);
           ans+=curr;
           int num=(int)Math.ceil((double)curr/3);
           System.out.print(" "+num);
           maxHeap.add(num);
           System.out.println();
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={1,10,3,3,3};
        int k=3;
        System.out.println(maxKelements(arr, k));
    }
}
