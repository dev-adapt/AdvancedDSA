package PRACTICE;

public class recursion {
    static int fibonacci(int n){
        if(n==1)return n;
        return n*fibonacci(n-1);
    }
    public static void main(String[] args) {
        int n=4;
       System.out.println( fibonacci(n));
    }
}
