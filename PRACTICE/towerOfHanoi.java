package PRACTICE;

public class towerOfHanoi {
    static void hanoi(int n,char s, char h,char d){
        if(n==0)return;
        hanoi(n-1,s,d,h);
        System.out.println(s+"->"+d);
        hanoi(n-1,h,s,d);
    }
    public static void main(String[] args) {
        int n=4;
        hanoi(n ,'A','B','C');
    }
}
