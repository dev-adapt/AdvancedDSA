package leetcodeJUNE;
//342
public class powerOfFour {
    static boolean power(int n){
        if(n==1)return true;
        return power(n/4);
    }
    public static void main(String[] args) {
        int n=16;
        System.out.println(power(n));
    }
}
