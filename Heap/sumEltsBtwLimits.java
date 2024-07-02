package Heap;
import java.util.*;
public class sumEltsBtwLimits {
    static int sumOfElements(int arr[],int k1,int k2){
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        int sum=0;
        for(int i:arr){
            pq.offer(i);
        }
        for(int i=0;i<k1;i++){
            pq.remove();
        }
        for(int i=k2-k1+1;i<k2;i++){
            sum+=pq.poll();
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[]={20,8,22,4,12,10,14};
        int k1=3,k2=6;
        System.out.println(sumOfElements(arr, k1, k2));
    }
}
