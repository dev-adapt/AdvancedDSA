import java.util.HashMap;

public class longestSubarraySumZero {
   public int maxLen(int arr[]) {
        // code here
        int max=0,sum=0;
        int n=arr.length;
       HashMap<Integer,Integer>mp=new HashMap<>();
       for(int i=0;i<n;i++){
        sum+=arr[i];
        if(sum==0)max=i+1;
        else if(sum!=0 && mp.containsKey(sum)){
            max=Math.max(max,i-mp.get(sum));
       }else if(sum!=0 && !mp.containsKey(sum)){
        mp.put(sum,i);
       }
    }
        return max;
    }
}
