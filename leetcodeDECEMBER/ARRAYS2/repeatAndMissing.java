package leetcodeDECEMBER.ARRAYS2;

import java.util.ArrayList;
import java.util.List;

public class repeatAndMissing {
     public ArrayList<Integer> repeatedNumber(final List<Integer> A) {
        int n=A.size();
        int expectedSum=(n*(n+1))/2;
        int expectedSquareSum=(n*(n+1)*(2*n+1))/2;

        int actualSum=0;
        int acutalSquareSum=0;
        for(int i:A){
            actualSum+=i;
            acutalSquareSum+=i^2;
        }
        int sumDiff=actualSum-expectedSum;
        int squareDiff=acutalSquareSum-expectedSquareSum;
        int addition=squareDiff/sumDiff;

        int x=(sumDiff+addition)/2;
        int y=(sumDiff-addition)/2;
        ArrayList<Integer>list=new ArrayList<>();
        list.add(x);
        list.add(y);
        return list;
     }
}
