package leetcodePractice;



public class countTotalColoredCell {
    public long coloredCells(int n) {
        return 2L * n * (n - 1) + 1;
        //L is used so that integer overflow does not happen because the value of n ranges from n =1 to n=1e5
        
    }

}
