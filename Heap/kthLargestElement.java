package Heap;
import java.util.*;
public class kthLargestElement {
    static int kthLargest(int nums[],int k){
       // int n=nums.length;
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int i:nums){
           if(pq.size()==k){
            if(i>pq.peek()){
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
        int nums[]={3,7,2,9,5};
        int k=3;
        System.out.println(kthLargest(nums, k));
    }

}
