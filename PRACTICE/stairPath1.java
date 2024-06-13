package PRACTICE;

public class stairPath1 {
    static int StairPath(int n){
       if(n<=2)return n;
       return StairPath(n-1)+StairPath(n-2);
}
    public static void main(String[] args) {
        int n=5;
        //String s="";
        System.out.println(StairPath(n));
    }
}
