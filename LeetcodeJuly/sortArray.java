import java.util.HashMap;

public class sortArray {
    public static int[] frequencySort(int[] nums) {
        int freq[]=new int[204];
       for(int i:nums){
        if(i>=0){
            freq[i]++;
        }else{
            freq[99-i]++;
        }
    }
       int idx=0,val=nums.length;
       
        while(val-->0){
            int min=Integer.MAX_VALUE,minIdx=0;
            for(int i=0;i<freq.length;i++){
                if(freq[i]!=0 && freq[i]<min){
                    min=freq[i];
                   if(i>99)minIdx=i-99;
                   else minIdx=i;
                }
            }
           freq[minIdx]=0;
            int j=0;
            while(j <min){
                nums[idx++]=minIdx;
                j++;
            }
            
        }
        return nums;
    }
    public static void main(String[] args) {
        int nums[] = {-1,1,-6,4,5,-6,1,4,1};
        int ans[]=frequencySort(nums);
        System.out.print("[");
        for(int i:ans) System.out.print(i+", ");
        System.out.print("]");
        System.out.println();
    }
}
