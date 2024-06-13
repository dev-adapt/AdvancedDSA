package PRACTICE;

public class aRaisedToBlogarithmic {
    static int logarithmic(int a,int b){
        if(b==1)return a;
        if(b%2!=0) return a* logarithmic(a, b/2) * logarithmic(a, b/2);
        return logarithmic(a, b/2) *logarithmic(a, b/2);
    }
    public static void main(String[] args) {
        int a=2,b=5;
        System.out.println(logarithmic(a, b));
    }
}
