class Solution {
    public long shiftDistance(String s, String t, int[] nextCost, int[] previousCost) {
        long totalCost = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            int start = s.charAt(i) - 'a'; 
            int end = t.charAt(i) - 'a';   

            if (start == end) continue; 

            int frwd = (end - start + 26) % 26;
            long frwdcost = 0;
            for (int j = 0; j < frwd; j++) {
                frwdcost += nextCost[(start + j) % 26];
            }
            int bkwd = (start - end + 26) % 26;
            long bkwdcost = 0;
            for (int j = 0; j < bkwd; j++) {
                bkwdcost += previousCost[(start - j + 26) % 26];
            }
            totalCost += Math.min(frwdcost, bkwdcost);
        }

        return totalCost;
}
}
