public class maxProfit {
    public static int maxProfit(int[] prices) {
        int n=prices.length;
        int min=Integer.MAX_VALUE,idx=0;
        for(int i=0;i<n;i++){
            if(prices[i]<min){
                min=prices[i];
                idx=i;
            }
        }
        int profit=0;
        for(int i=idx+1;i<n;i++){
            if(prices[i]>min){
                profit=Math.max(profit, prices[i]-min);
            }
        }
    return profit;
    }
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
