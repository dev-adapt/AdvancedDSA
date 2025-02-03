public class findSingleElt {
    public int singleNonDuplicate(int[] nums) {
        int n=nums.length;
        if(n==1)return nums[0];//if array size is 1
        if(nums[0]!=nums[1])return nums[0];//checking for first element
        if(nums[n-1]!=nums[n-2])return nums[n-1];//checking for the last element

        int low=1,high=n-2;
        //check for first and last index separately if they are unique and single size array
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1])return nums[mid]; //if the middle element is the unique one
            else if((mid%2==0 && nums[mid]==nums[mid-1])||(mid%2==1 && nums[mid]!=nums[mid-1])){ //if( mid = even & nums[mid] equals nums [mid-1]) || 
                //(mid==odd && nums[mid] unequal to nums[mid-1])
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return -1;
    }
}
