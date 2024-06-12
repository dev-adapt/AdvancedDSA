package PRACTICE;
//recursion
public class nthFibonacci {
    static int fibonacii(int n){
        if(n==1 || n==2)return 1;
        return fibonacii(n-1)+fibonacii(n-2);
    }
    public static void main(String[] args) {
        int n=7;
        //1 1 2 3 5 8 13
        System.out.println(fibonacii(n));
    }
}
