package leetcode;

public class buyingTicket {
    static int countTime(int[]arr,int k){
        int counter=0;
        while(arr[k]!=0){
            for(int i=0;i<arr.length;i++){
                int curr=arr[i];
                if(curr>0){
                    arr[i]=curr-1;
                    counter++;
                }
            }
        }
        return counter;
    }
   public static void main(String[] args) {
    int arr[]={5,1,1,1};
    int k=0;
    System.out.println(countTime(arr,k)+" seconds were taken by k to buy tickets");
   } 
}
