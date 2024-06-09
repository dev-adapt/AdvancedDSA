package leetcodeJUNE;

public class subarraySums {
    static  int subarraysDivByK(int[] nums, int k) {
        int ans=0,n=nums.length;
        int arr[]=new int[n];
      
        arr[0]=nums[0];
        for(int i=1;i<n;i++)  
            arr[i]=arr[i-1]+nums[i];

        for(int i=0;i<n;i++)
            if(arr[i]%k==0)ans++;
        
        int arr2[][]=new int[n-1][];
        int n2=arr2.length;
      
        for(int i=0;i<n2;i++){
            arr2[i]=new int[n2-i]; //declaring the width of array later
            int l=arr2[i].length,w=0;
            for(int j=0;j<=n2;j++){
                if(j>i && w<l){
                    arr2[i][w]=arr[j]-arr[i];
                    if(arr2[i][w]%k==0)ans++;
                    w++;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[]  nums = {1,-10,5};
        int k = 9;
        System.out.println(subarraysDivByK(nums, k));
    }
}
