package leetcodeJUNE;
//75
public class sortColor {
    static void sortColors(int[] nums) {
        int arr[]=new int[3];
        int idx=0;
        for(int i:nums)arr[i]++;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i];j++)nums[idx++]=i;
        }
    }
    public static void main(String[] args) {
        int nums[]={2,0,2,1,1,0};
        sortColors(nums);
        for(int i:nums)System.out.print(i+" ");
        System.out.println();
    }
}
