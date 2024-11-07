
public class settingBits {
     static void swap(int []nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
        return;
    }
    public static boolean canSortArray(int[] nums) {
        boolean flag=true;
        while(flag){
            flag=false;
            for(int i=0;i<nums.length-1;i++){
                if(nums[i]>nums[i+1]){
                   // System.out.println(nums[i]+" "+nums[i+1]);
                    if(Integer.bitCount(nums[i])==Integer.bitCount(nums[i+1])){swap(nums, i, i+1);
                    flag=true;
                  //  System.out.println(nums[i]+" "+nums[i+1]);}
                }
            }
        }}
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1])return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int[]arr={8,4,2,30,15};
        System.out.println("hello");
        System.out.println(canSortArray(arr));
    System.out.println();
        for(int i:arr)System.out.print(i+" ");
        System.out.println();
    }
}
