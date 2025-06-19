package Year2025.leetcodeJune.String;

public class firstOccurence {
     public int strStr(String pool, String pin) {
        int len=pin.length();
        int n=pool.length();
        for(int i=0;i<n-len;i++){
            if(pool.substring(i,i+len).equals(pin))return i;
        }
        return -1;
    }
}
