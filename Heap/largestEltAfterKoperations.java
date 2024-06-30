package Heap;
import java.util.*;
public class largestEltAfterKoperations {
    static int largest(PriorityQueue<Integer>pq,int k){
        for(int i=0;i<k;i++){
            int n=pq.poll();
            int m=pq.poll();
            pq.offer(n*m);
        }
        while(pq.size()!=1){
            pq.remove();
        }
        return pq.remove();
    }
    public static void main(String[] args) {
        int k=3;
        int arr[]={2,4,3,1,5};
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int i:arr){
            pq.offer(i);
        } 
        System.out.println(largest(pq, k));
    }
}
