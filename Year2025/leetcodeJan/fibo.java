public class fibo {
    public int fib(int n) {
        int num1=0,num2=1;
        int ans=0;
        for(int i=0;i<=n-2;i++){
            ans=num1+num2;
            num1=num2;
            num2=ans;
        }
        return ans;
    }
}
