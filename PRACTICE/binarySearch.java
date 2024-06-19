package PRACTICE;

import java.util.*;


public class binarySearch {
    static int searchIdx(int arr[],int x){
        HashMap<Integer,Integer>mp=new HashMap<>();
        //key=index;value=arr[i]
        for(int i=0;i<arr.length;i++){
           if(arr[i]<=x) mp.put(i,arr[i]);
        }
        int max=(Collections.max(mp.values()));
        int key=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==max){
                key= i;
            }
        }
        return key;
    }
    public static void main(String[] args) {
        int arr[]={1,4,3,5,7,8,13,89,9,10};
        int nums=13;
       System.out.println( searchIdx(arr, nums));
    }
}
