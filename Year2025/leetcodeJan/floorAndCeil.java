import java.util.*;
public class floorAndCeil {
    public int[] getFloorAndCeil(int x, int[] arr) {
        Arrays.sort(arr); // Ensure the array is sorted
        int[] answer = new int[2];
        answer[0] = floor(arr, x);
        answer[1] = ceil(arr, x);
        return answer;
    }

    private int ceil(int[] arr, int target) {
        int low = 0, high = arr.length - 1, ans = -1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) return arr[mid]; // Exact match
            else if (arr[mid] > target) {
                ans = arr[mid]; // Potential ceil
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans; // If no ceil exists, returns -1
    }

    private int floor(int[] arr, int target) {
        int low = 0, high = arr.length - 1, ans = -1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) return arr[mid]; // Exact match
            else if (arr[mid] < target) {
                ans = arr[mid]; // Potential floor
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans; // If no floor exists, returns -1
    }
}
