package BINARY_SEARCH;
public class sqrRoot {
    int floorSqrt(int n) {
        // Your code here
        int high=n,low=1;
        while(low<=high){
            int mid=(low+high)/2;
            long val=mid*mid;
            if(val<=(long)n)  low=mid+1;
            else high=mid-1;
        }
        return high;
    }
}
