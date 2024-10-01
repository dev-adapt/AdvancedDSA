package leetcodeAugustAndSeptember;

import java.util.ArrayList;

public class divisibleBy {
    public boolean canArrange(int[] arr, int k) {
        int freq[]=new int[k];
        for(int i:arr){
            int curr=((i%k)+k)%k;
            freq[curr]++;
        }
        for(int i=1;i<k;i++){
            if(i==k-i&&freq[i]%2!=0)return false;
            if(freq[i]!=freq[k-i])return false;
            
        }
        return true;
    }
    public static void main(String[] args) {
        int k=11,i=-1000;
        System.out.println(i%k);
        System.out.println((i%k)+k);
      //  System.out.println((i%k)+k);
        int curr=((i%k)+k)%k;
        System.out.println(curr);
    }
}
