public class shipCarryingWeights {
    public static int shipWithinDays(int[] weights, int days) {
      //  int low=1,high=100000;
      int low = Integer.MIN_VALUE, high = 0;
      for (int i = 0; i < weights.length; i++) {
          high += weights[i];
          low = Math.max(low, weights[i]);
      }
        while(low<high) {
            int mid=(low+high)/2;
            if(checkWeight(weights, mid, days)==1)high=mid;
            else if(checkWeight(weights, mid, days)==0) low=mid+1;
        }
        return low;

    }
    public static int checkWeight(int[]weights,int x,int days){
        int n=weights.length;
        int curr=0;
        int count=1;
       
        for(int i=0;i<n;i++){
            if(curr+weights[i]<=x){
                curr+=weights[i];
            }else{         
                count++;
                curr=weights[i];    
            }
           // i++;
            if(count>days)return 0;
        }
        // if(count<=days)return 1;
        return 1;
    }
    public static void main(String[] args) {
        int[]weights={1,2,3,4,5,6,7,8,9,10};
        int days=5;
        System.out.println(shipWithinDays(weights, days));
    }
}
