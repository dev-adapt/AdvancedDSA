package leetcode;

public class maxPrimeDiff {
    static void printingArray(int[]arr){
        for(int i=0;i<arr.length;i++)
         System.out.print(arr[i]);
         System.out.println();
    }
    static int maxPrime(int[]arr){
        int ans=0,max=0;
        for(int i=0;i<arr.length;i++){
            if(prime(arr[i]))arr[i]=i;
            else arr[i]=-1;
        }
      
        int i=0,j=arr.length-1;
        while(i<j){
           
            if(arr[i]<0)i++;
           else if(arr[j]<0)j--;
           else if(arr[i]>=0 &&arr[j]>0){ans=arr[j]-arr[i];
                    i++;
                j--;}
            if(ans>max)max=ans;
        }
       
        return max;
    }
    static boolean prime(int num){
        int count=0;
        for(int i=1;i<=num;i++){
            if(num%i==0)count++;
        }
        return count==2;
    }
    public static void main(String[] args) {
        int arr[]={4,2,9,5,3};
   
        System.out.println(maxPrime(arr));
    }
}
