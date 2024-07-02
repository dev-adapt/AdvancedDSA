package GreedyAlgoirthm;

import java.util.Collections;
import java.util.PriorityQueue;

public class FreactionalKnapsack {
    static int profitMax(int[][]arr,int w){
        int n=arr.length;
        int profitByWeight[]=new int[n];
       // HashMap<Integer,Double>mp=new HashMap<>();
        for(int i=0;i<n;i++){
            int profit=arr[i][0];
            int weight=arr[i][1];
           profitByWeight[i]=profit/weight;
        }
        int profit=0;
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i:profitByWeight)pq.offer(i);
        while(w!=0){
            int max=pq.remove();
            int idx=-1;
            for(int i=0;i<n;i++){
                if(profitByWeight[i]==max){
                    idx=i;
                    break;
                }
            }
            int weightMax=arr[idx][1];
            if(w>=weightMax){
                profit+=arr[idx][0];
                w-=weightMax;
            }else{
                profit+=max*w;
                w=0;
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        int arr[][]={{60,10},{100,20},{120,30}};
        int w=50;
        System.out.println(profitMax(arr, w));
    }
}
