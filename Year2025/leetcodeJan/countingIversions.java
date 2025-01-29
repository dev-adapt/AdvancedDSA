import java.util.ArrayList;

public class countingIversions {
    static int inversionCount(int arr[]) {
        // Your Code Here
        int ans=mergeSort(arr, 0, arr.length-1);
        return ans;
    }
    static int mergeSort(int[]arr ,int low,int high){
        int cnt=0;
        if(low>=high)return cnt;
        int mid=(low+high)/2;
        cnt+=mergeSort(arr, low, mid);
        cnt+=mergeSort(arr, mid+1, high);
       
       cnt+= merge(arr, low, mid, high);
        return cnt;
        
    }
   
    static int merge(int arr[],int low,int mid,int high){
        ArrayList<Integer>list=new ArrayList<>();
        int cnt=0;
        int left=low,right=mid+1;
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                list.add(arr[left]);
                left++;
            }else{
                list.add(arr[right]);
                 cnt += (mid - left + 1);
                right++;
            }
        }
        while(left<=mid){list.add(arr[left]);
            left++;
        }
        while(right<=high){list.add(arr[right]);
            right++;
        }
        for(int i=low;i<=high;i++){
            arr[i]=list.get(i-low);
        }
        return cnt;
    }
}
