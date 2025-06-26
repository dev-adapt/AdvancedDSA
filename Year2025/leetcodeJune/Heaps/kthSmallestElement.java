package Year2025.leetcodeJune.Heaps;


import java.util.*;

public class kthSmallestElement {
     public static int findKthSmallest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i:nums){
           if(pq.size()==k ){
             if(pq.peek()>i){
                 pq.remove();
                 pq.add(i);
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
        System.out.println(findKthSmallest(nums, k));
    }
}
