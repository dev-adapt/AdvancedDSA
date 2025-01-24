
public class reverseNum {
    public static int reverse(int x) {
        // int n=x;
        // if(x<0)x=x*(-1);
        // ArrayList<Integer>list=new ArrayList<>();
        // while(x>0){
        //     list.add(x%10);
        //     x=x/10;
        //     System.out.print(x+"  ");
        // }
        // if(list.get(0)==0)list.remove(0);
        // long combinedNumber = 0;
        // for (int num : list) {
        //     combinedNumber = combinedNumber * 10 + num;
        // }
        // if(n<0)combinedNumber=combinedNumber*(-1);
        // if(combinedNumber>Integer.MAX_VALUE ||combinedNumber<Integer.MIN_VALUE)return 0;
        // return (int)combinedNumber;
        int rem=0,n=x;
        long sum=0;
        if(x<0) x=x*(-1);
        while(x>0){
            rem=x%10;
            sum=sum*10+rem;
            x/=10;
        }
        if(n<0)sum=sum*(-1);
        if(sum<Integer.MIN_VALUE || sum>Integer.MAX_VALUE)return 0;
        return (int)sum;
    }
    public static void main(String[] args) {
        int x=-1230;
        System.out.println(reverse(x));
    }
}
