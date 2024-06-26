package leetcodeJUNE;
public class divisibleByThree {
    public static int minimumOperations(int[] nums) {
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            int remainder=nums[i]%3;
            if(remainder!=0)
                count+=1;
        }
        return count;
    }
   public static void main(String[] args) {
    int nums[]={1,2,3,4};
    System.out.println(minimumOperations(nums));
   } 
}
