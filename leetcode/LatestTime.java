package leetcode;

public class LatestTime {
    static String latestTiming(String time) {
        char[] s = time.toCharArray();
        if (s[0] == '?' && s[1] == '?')
            s[0] = s[1] = '1';
        else {
            if (s[0] == '?') s[0] = s[1] > '1' ? '0' : '1';
            if (s[1] == '?') s[1] = s[0] == '0' ? '9' : '1';
        }
        if (s[3] == '?') s[3] = '5';
        if (s[4] == '?') s[4] = '9';
        return new String(s);
    }

    public static void main(String[] args) {
        String time = "1?:3?";
        System.out.println(latestTiming(time));
    }
}
