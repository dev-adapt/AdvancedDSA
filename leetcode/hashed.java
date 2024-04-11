package leetcode;

public class hashed {
    static int hashedNum(int x){
        int num=x,sum=0;
        while(num>0){
            sum+=num%10;
            num/=10;
        }
        if(x%sum==0)return sum;
        else return -1;
    }
    public static void main(String[] args) {
        int x=18;
        System.out.println(hashedNum(x));
    }
}
