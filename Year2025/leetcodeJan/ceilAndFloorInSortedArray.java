import java.util.ArrayList;
import java.util.Arrays;

public class ceilAndFloorInSortedArray {
    public static int[] getFloorAndCeil(int[] a, int n, int x) {
        int idx=-1,floor=-1;
        int low=0,high=n-1;

        while(low<=high){
            int mid=(low+high)/2;
            if(a[mid]==x){
                return new int []{x,x};
            }else if(a[mid]<x){
                floor=a[mid];
                idx=mid;
                low=mid+1;
            }else high=mid-1;
        }
        if(idx+1<n)return new int[]{floor,a[idx+1]};
        if(idx+1>=n) return new int[]{floor,-1};
        if(floor==-1)return new int[]{-1,a[0]};

        return new int[]{floor,a[idx+1]};
      }
      public static void main(String[] args) {
        int arr[]={3, 4, 7, 8, 8, 10};
        int n=arr.length;
        int x=5;
        int ans[]=getFloorAndCeil(arr, n, x);
        System.out.println(ans[0]+" "+ans[1]);
      }
}
