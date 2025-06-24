package Year2025.leetcodeJune.Heaps;

import java.util.PriorityQueue;

public class kthLargestElement {
     public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i:nums){
           if(pq.size()==k ){
             if(pq.peek()<i){
                System.out.println(pq.peek());
                 pq.remove();
                 System.out.println(i);
                 pq.add(i);
                 System.out.println();
             }
            continue;
           }
           pq.add(i);
        }
        return pq.peek();
    }
    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        int k = 2;
        System.out.println(findKthLargest(nums, k));
    }
}
