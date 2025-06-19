package Year2025.leetcodeJune.String;

public class ATOIconversion {
     public static int myAtoi(String s) { //"0-1"   "1337c0d3"  " -042"
        long ans=0;
        boolean isNegative=false;
        boolean leadingZero=true;
        int n=s.length();
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(c==' ')continue;
           else if(c=='0' && leadingZero)continue;
           else if(c=='-'){
                if(!isNegative &&  !leadingZero) {
                    ans*=-1;
                    isNegative=true;
                }else{ 
                   if(ans< Integer.MIN_VALUE)return Integer.MIN_VALUE;
                   return (int)ans;
                }
           }else if((int)c >57 || (int)c<48){
             if(ans< Integer.MIN_VALUE)return Integer.MIN_VALUE;
             if(ans>Integer.MAX_VALUE)return Integer.MAX_VALUE;
             return (int)ans;
           }else if((int)c <=57 && (int)c>=48){
              if(isNegative && leadingZero)continue;
              if(ans==-1) ans+=c-'0'-1;
              if(i<n-1)  ans*=10;
              ans+=c-'0';       
           }
           System.out.println(ans);
        }
         if(ans< Integer.MIN_VALUE)return Integer.MIN_VALUE;
             if(ans>Integer.MAX_VALUE)return Integer.MAX_VALUE;
             return (int)ans;
    }
    public static void main(String[] args) {
        System.out.println(myAtoi(" -042"));
    }
}
