package leetcodeDECEMBER.ARRAYS2;

public class inversionOfArray {

    
        public static long getInversions(long arr[], int n) {
            return mergeSortAndCount(arr, 0, n - 1);
        }
    
        // Merge Sort and Count function
        private static long mergeSortAndCount(long[] arr, int left, int right) {
            long count = 0;
    
            if (left < right) {
                int mid = left + (right - left) / 2;
    
                // Count inversions in the left half
                count += mergeSortAndCount(arr, left, mid);
    
                // Count inversions in the right half
                count += mergeSortAndCount(arr, mid + 1, right);
    
                // Count inversions while merging the two halves
                count += mergeAndCount(arr, left, mid, right);
            }
    
            return count;
        }
    
        private static long mergeAndCount(long[] arr, int left, int mid, int right) {
            // Create temporary subarrays
            int n1 = mid - left + 1;
            int n2 = right - mid;
    
            long[] leftArray = new long[n1];
            long[] rightArray = new long[n2];
    
            for (int i = 0; i < n1; i++)
                leftArray[i] = arr[left + i];
            for (int j = 0; j < n2; j++)
                rightArray[j] = arr[mid + 1 + j];
    
            int i = 0, j = 0, k = left;
            long swaps = 0;
    
            // Merge the two arrays
            while (i < n1 && j < n2) {
                if (leftArray[i] <= rightArray[j]) {
                    arr[k++] = leftArray[i++];
                } else {
                    arr[k++] = rightArray[j++];
                    swaps += (n1 - i); // Count inversions
                }
            }
    
            // Copy remaining elements of leftArray
            while (i < n1) {
                arr[k++] = leftArray[i++];
            }
    
            // Copy remaining elements of rightArray
            while (j < n2) {
                arr[k++] = rightArray[j++];
            }
    
            return swaps;
        }
    
        public static void main(String[] args) {
            long[] arr = {8, 4, 2, 1};
            int n = arr.length;
            System.out.println("Number of inversions: " + getInversions(arr, n));
        }
    }
    
