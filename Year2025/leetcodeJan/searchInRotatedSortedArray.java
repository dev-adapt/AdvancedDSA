public class searchInRotatedSortedArray {
    static boolean searchNum(int[]arr,int target){
        int st = 0, end = arr.length - 1;
        while(st<=end){
            int mid=st+(end-st)/2;
          //  System.out.println(st+" "+mid+" "+end);
            if(arr[mid]==target){
                return true;
            }
            else if(arr[mid]==arr[st] && arr[mid]==arr[end]){//shrinking the search space when all are equal
                end--;
                st++;
            }else if(arr[st]<=arr[mid]){ //left half is sorted
                if(target>=arr[st]&& target<arr[mid]){
                     end=mid-1;
                }else{
                    st=mid+1;
                }
            }else{//right half of the array is sorted
                if(target<=arr[end] && target>arr[mid]){
                    st=mid+1;
                }else{
                    end=mid-1;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={3,3,3,3,1,2,3,3,3,3,3,3,3,3};
        int target=1;
        System.out.println(searchNum(arr, target));
    }
}
