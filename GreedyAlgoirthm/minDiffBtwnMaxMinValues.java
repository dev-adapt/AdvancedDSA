package GreedyAlgoirthm;

import java.util.Arrays;

//1509
public class minDiffBtwnMaxMinValues {
    static int threeMoves(int arr[]){
        int n=arr.length;
        if(n <= 4) {
            return 0;
        }
        Arrays.sort(arr);
        int ans=arr[n-1]-arr[0];
        for(int i=0;i<4;i++){
            ans=Math.min(ans,arr[n-1-(3-i)]-arr[i]);
        }
        return ans;

    }
    public static void main(String[] args) {
        int nums[]={1,5,0,10,14};
        System.out.println(threeMoves(nums));
    }
}
