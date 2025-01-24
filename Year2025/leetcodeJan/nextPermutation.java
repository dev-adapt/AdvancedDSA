public class nextPermutation {
        private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public void nextPermutation(int[] nums) {
         int n = nums.length;
        int idx = -1;
        
        // Step 1: Find the largest index 'idx' such that nums[idx] < nums[idx + 1]
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                idx = i;
                break;
            }
        }
        
        // Step 2: If no such index exists, reverse the whole array
        if (idx == -1) {
            reverse(nums, 0, n - 1);
            return;
        }
        
        // Step 3: Find the largest index 'i' greater than 'idx' such that nums[i] > nums[idx]
        for (int i = n - 1; i > idx; i--) {
            if (nums[i] > nums[idx]) {
                // Swap nums[idx] and nums[i]
                int temp = nums[idx];
                nums[idx] = nums[i];
                nums[i] = temp;
                break;
            }
        }
        
        // Step 4: Reverse the subarray from idx + 1 to the end
        reverse(nums, idx + 1, n - 1);
    }
}

