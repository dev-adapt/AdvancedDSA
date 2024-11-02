
import java.util.*;

public class kbitInString {
    public static char findKthBit(int n, int k) {
        StringBuilder s=new StringBuilder("0");
        
        for(int i=2;i<=n;i++){
            StringBuilder curr=new StringBuilder(s);
            curr.append(1);
            curr.append(invertAndReverse(null));
            int len=s.length();
            s.delete(0,len);
            s.append(curr);
        }
        return s.charAt(k);
    }
    public static String invertAndReverse(String s){
       
        long num=Integer.parseInt(s,2);
        num=~num;
        num=(reverseBits(num));
        String str = String.valueOf(num);
        return str;
    }
    public static long reverseBits(long n) {
        long result = 0;
        long bitCount = Integer.SIZE;  // Total number of bits in an integer (32 bits)

        for (int i = 0; i < bitCount; i++) {
            result <<= 1;       // Shift the result to the left to make space for the next bit
            result |= (n & 1);  // Get the least significant bit of n and set it in result
            n >>= 1;            // Shift n to the right to process the next bit
        }

        return result;
    }
}
