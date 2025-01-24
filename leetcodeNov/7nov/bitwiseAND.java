import java.util.ArrayList;
import java.util.List;

public class bitwiseAND {
    
        public static int largestCombination(int[] candidates) {
            int binaryCount[] = new int[32];
            for(int i=0; i<32; i++){
                for(int j : candidates){
                    if(((j >> i) & 1) == 1){
                        binaryCount[i]++;
                    }
                }
            }
            int max = 0;
            for(int i : binaryCount){
                max = Math.max(max, i);
            }
            return max;
        }
        public static void main(String[] args) {
        int candidates[]={16,17,71,62,12,24,14};
        System.out.println(largestCombination(candidates));
    }
}
