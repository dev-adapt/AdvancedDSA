public class LCMandGCD {
    public static int[] lcmAndGcd(int a, int b) {
        // code here
        int num1=a,num2=b;
        int n=Math.min(a, b);
        int LCM=1,GCD=1;
        for(int i=n;i>0;i--){
            if(a%i==0 && b%i==0){
                LCM*=i;
                a/=i;
                b/=i;
            }
        }
        LCM*=a*b;
        for(int i=n;i>0;i--){
            if(num1%i==0 && num2%i==0){
                GCD*=i;
                break;
            }
        }
        int ans[]={LCM,GCD};
        return ans;
    }
    public static void main(String[] args) {
        int a=5,b=10;
       int arr[]=lcmAndGcd(a, b);
       System.out.println(arr[0]+" "+arr[1]);
    }
}
