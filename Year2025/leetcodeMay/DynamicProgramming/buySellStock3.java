public class buySellStock3 {
    public int maxProfit(int[] arr) {
        int n=arr.length;
        int ahead[][]=new int[2][3];
        int curr[][]=new int[2][3];
        for(int i=n-1;i>=0;i--){
            for(int cap=0;cap<=2;cap++){
                curr[0][cap]=Math.max(0+ahead[0][cap], -arr[i]+ahead[1][cap]);
                curr[1][cap]=Math.max(0+ahead[1][cap],arr[i]+ahead[0][cap-1]);
            }
            ahead=(int[][])(curr.clone());
        }
        return ahead[0][2];
    }
}
