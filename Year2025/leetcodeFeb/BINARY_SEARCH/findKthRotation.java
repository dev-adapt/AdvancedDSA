package BINARY_SEARCH;
public class findKthRotation {
    public static int findKRotation(int[] arr) {
        int low = 0, high = arr.length - 1;
        int ans = Integer.MAX_VALUE;
        int index = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[low] <= arr[high]) {
                if (arr[low] < ans) {
                    index = low;
                    ans = arr[low];
                }
                break;
            }
            //if left part is sorted:
            if (arr[low] <= arr[mid]) {
                // keep the minimum:
                if (arr[low] < ans) {
                    index = low;
                    ans = arr[low];
                }
                // Eliminate left half:
                low = mid + 1;
            } else { //if right part is sorted:
                // keep the minimum:
                if (arr[mid] < ans) {
                    index = mid;
                    ans = arr[mid];
                }
                // Eliminate right half:
                high = mid - 1;
            }
        }
        return index;
    }
}
