public class maxPair {
    public static int pairWithMaxSum(int arr[]) {
        // Your code goes here
        int max=arr[0]+arr[1];
        for(int i=1;i<arr.length-1;i++){
            int curr=arr[i]+arr[i+1];
            max=Math.max(max, curr);
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={4,3,2,1,5,6};
        System.out.println(pairWithMaxSum(arr));
    }
}
