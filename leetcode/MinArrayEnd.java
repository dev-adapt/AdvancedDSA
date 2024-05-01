package leetcode;
// import java.util.*;
public class MinArrayEnd {
    static long minArray(int n,int x){
        long a = x;
        while (--n > 0)
           a=(a + 1) | x;
        return a;
    }
    public static void main(String[] args) {
        int n=3,x=4;
        System.out.println(minArray(n, x));
    }
}
