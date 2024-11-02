package leetcodeOctober.NPTEL;

public class reverseSort {
    public static void main(String[] args) {
        int arr[]={4,2,1,3};
        int cost=0;
        int n=arr.length;
        int idx=0;
        while(idx<n-1){
            int min=Integer.MAX_VALUE;
            int index=-1;
            for(int i=idx;i<n;i++){
                if(arr[i]<min){
                    min=arr[i];
                    index=i;
                }
            }
            int st=idx;
            cost+=index-idx+1;
            while(st<index){
                int temp=arr[index];
                arr[index]=arr[st];
                arr[st]=temp;
                st++;
                index--;
            }
            idx++;
        }
        System.out.println(cost);
    }
}
