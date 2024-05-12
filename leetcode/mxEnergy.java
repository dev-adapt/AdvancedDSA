package leetcode;

public class mxEnergy {
    static int maximumEnergy(int[]arr,int k){
         int ans=0;
        // int answer[]=new int [arr.length];
        for(int i=0;i<arr.length;i++){
            int curr=arr[i];
            for(int j=i+k;j<arr.length;j+=k){
                curr+=arr[j];
            }
             ans=Math.max(ans, curr);
        }
        return ans;
    }
    public static void main(String[] args) {
        int []arr={-2,-3,-1};
        int k=2;
        System.out.println(maximumEnergy(arr, k));
    }
}
