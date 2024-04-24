package leetcode;
public class tribonacci {
    static int tribonacciSum(int n){
        int a=0,b=1,c=1,sum=0;
        if(n==0)return a;
        if(n==1)return b;
        for(int i=3;i<=n;i++){
            sum=a+b+c;
            a=b;
            b=c;
            c=sum;
        }
        return sum;
    }
    public static void main(String[] args){
        int number=4;
        System.out.println(tribonacciSum(number));
    }
}
