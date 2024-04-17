package leetcode;
//import java.lang.Math;
public class divideInteger {
    static int divide(int big,int small){
        int num=1;
      //  int power=(int)Math.pow(small,num);
      if((big>=0&&small>=0)||(big<0&&small<0)){
        while(big-(small*num)>=small){
            num++;
        }
}else{
    do{ 
        num++;
    }while(big+(small*num)<=small);
    return -num;
}
        return num;
    }
    public static void main(String[] args) {
        int divident=7,divisor=-3;
        System.out.println(divide(divident, divisor));
    }
}
