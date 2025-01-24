public class armstrong {
    static boolean armstrongNum(int n){
        int num=n,rem=0,curr=n;
        int ans=0, len=0;
        int lenCheck=n;
        while(lenCheck>0){
            lenCheck=lenCheck/10;
            len++;
        }
        while(curr>0){
            rem=curr%10;

            ans+=Math.pow(rem,len);
            curr/=10;
            System.out.print(rem+" "+curr+" ");
        }
        System.out.println(ans);
        return(ans==num)?true:false;
    }
    public static void main(String[] args) {
        int n=1634;
        System.out.println(armstrongNum(n));
       
    }
}
