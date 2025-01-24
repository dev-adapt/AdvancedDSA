public class palindrome {
    public static boolean isPalindrome(int x) {
        if(x<0)return false;
        
        int rem=0,n=x;
        long sum=0;
        while(x>0){
            rem=x%10;
            sum=sum*10+rem;
            x/=10;
        }
        return(n==sum)?true:false;
    }
    public static void main(String[] args) {
        int num=1221;
        System.out.println(isPalindrome(num));
    }
}
