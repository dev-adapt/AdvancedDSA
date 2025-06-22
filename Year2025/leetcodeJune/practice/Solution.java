class Solution {
    public int minSwaps(int[] nums) {
     List<Integer> evenIndices = new ArrayList<>();
        List<Integer> oddIndices = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0)
                evenIndices.add(i);
            else
                oddIndices.add(i);
        }

        int n = nums.length;
        int evenCount = evenIndices.size();
        int oddCount = oddIndices.size();

        if (Math.abs(evenCount - oddCount) > 1) return -1;
    }
        long getSwaps(List<Integer> positions, int startPos) {
            long swaps = 0;
            for (int i = 0; i < positions.size(); i++) {
                swaps += Math.abs(positions.get(i) - (startPos + 2 * i));
            }
            return swaps;
        }

        long res = Long.MAX_VALUE;

        if (evenCount >= oddCount) {
            res = Math.min(res, getSwaps(evenIndices, 0));
        }

        if (oddCount >= evenCount) {
            res = Math.min(res, getSwaps(oddIndices, 0));
        }

        return (int) res;
    }
}

