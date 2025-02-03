
public class kokoEatingBanana {
    public static int calculateTotalHours(int[] v, int hourly,int h) {
        int totalH = 0;
        int n = v.length;
        //find total hours:
        for (int i = 0; i < n; i++) {
            totalH += Math.ceil((double)(v[i]) / (double)(hourly));
            if(totalH>h)return 0;
        }
        return totalH;
    }

    public static int minEatingSpeed(int[] v, int h) {
        int low = 1, high = 1000000000;

        //apply binary search:
        while (low <= high) {
            int mid = (low + high) / 2;
            int totalH = calculateTotalHours(v, mid,h);
            if (totalH ==0) {
                low = mid + 1;
            } else {
                high = mid - 1;
               
            }
        }
        return low;
    }

}
