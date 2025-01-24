public class sumOfDivisors {
    public static int sumOfDivisorsFunc(int n) {
        // code here
        int sum=0;
        for(int i=1;i<=n;i++){
            int curr=i;
            int currSum=0;
            for(int j=1;j<=curr;j++){
                if(curr%j==0)currSum+=j;
            }
            sum+=currSum;
        }
        return sum;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(sumOfDivisorsFunc(n));
    }
}
