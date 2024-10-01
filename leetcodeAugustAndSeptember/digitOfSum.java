package leetcodeAugustAndSeptember;
public class digitOfSum {
    public static int minElement(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int i:nums){
            int curr=0;
            while(i>9){
                curr+=i%10;
                i=i/10;
            }
            min=Math.min(curr, min);
            System.out.println(min+" "+curr);
        }
        
        return min;
    }
    public static void main(String[] args) {
        int []nums={10,12,13,14};
        System.out.println(minElement(nums));
    }
}
