
public class firstAndLast {
    
    public static int[] searchRange(int[] nums, int target) {
       int ans[]=new int[2];
       //ans[0]=-1;
       int n=nums.length;
        int low=0,high=n-1;
        //finding first occurence
        int first=-1;
      while(low<=high){
        int mid=low+(high-low)/2;
        if(nums[mid]==target){
            high=mid-1;
            first=mid;
        }else if(target>nums[mid]){
            low=mid+1;
        }else{
            high=mid-1;
        }
      }
      low=0;high=n-1;
      int last=-1;
      //finding last occurence
      while(low<=high){
        int mid=low+(high-low)/2;
        if(nums[mid]==target){
            low=mid+1;
            last=mid;
        }else if(target>nums[mid]){
            low=mid+1;
        }else{
            high=mid-1;
        }
      }
      ans[0]=first;
      ans[1]=last;
       return ans;
    }
    public static void main(String[] args) {
        int arr[]={0,0,0,0,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,3,3,3,3,4,4,4,4};
        int target=1;
        int []ans=searchRange(arr, target);
        System.out.println(ans[0]+" "+ans[1]);;
    }
}
