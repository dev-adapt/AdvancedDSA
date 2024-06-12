package PRACTICE;
//recursion
public class aRaisedToB {
    static int raised(int a,int b){
        if(b==1)return a;
        return a*raised(a,b-1);
    }
    public static void main(String[] args) {
        int a=2;
        int b=5;
        System.out.println(raised(a,b));
    }
}
