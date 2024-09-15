package leetcodeAugustAndSeptember;

import java.util.Arrays;
public class makeArraysEqual {
     public static boolean canBeEqual(int[] target, int[] arr) {
        int[] cnt1 = new int[1001];
        int[] cnt2 = new int[1001];
        for (int v : target) {
            ++cnt1[v];
        }
        for (int v : arr) {
            ++cnt2[v];
        }
        return Arrays.equals(cnt1, cnt2);
    }
    public static void main(String[] args) {
        int[] target = {1,2,3,4}, arr = {2,4,1,3};
        System.out.println(canBeEqual(target, arr));
    }
}
