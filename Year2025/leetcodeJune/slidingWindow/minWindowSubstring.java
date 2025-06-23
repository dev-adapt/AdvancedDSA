import java.util.HashMap;
import java.util.Map;

public class minWindowSubstring {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) {
            return "";
        }

        Map<Character, Integer> mp = new HashMap<>();
        for (char ch : t.toCharArray()) {
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        }

        int remain = t.length();
        int[] minWindow = {0, Integer.MAX_VALUE};
        int l = 0;

        for (int j = 0; j < s.length(); j++) {
            char ch = s.charAt(j);
            if (mp.containsKey(ch) && mp.get(ch) > 0) {
                remain--;
            }
            mp.put(ch, mp.getOrDefault(ch, 0) - 1);

            if (remain == 0) {
                while (true) {
                    char charAtStart = s.charAt(l);
                    if (mp.containsKey(charAtStart) && mp.get(charAtStart) == 0) {
                        break;
                    }
                    mp.put(charAtStart, mp.getOrDefault(charAtStart, 0) + 1);
                    l++;
                }

                if (j - l < minWindow[1] - minWindow[0]) {
                    minWindow[0] = l;
                    minWindow[1] = j;
                }

                mp.put(s.charAt(l), mp.getOrDefault(s.charAt(l), 0) + 1);
                remain++;
                l++;
            }
        }

        return minWindow[1] >= s.length() ? "" : s.substring(minWindow[0], minWindow[1] + 1);        
    }
} 
    

