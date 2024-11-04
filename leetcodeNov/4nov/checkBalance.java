public class checkBalance {
    public boolean isBalanced(String num) {
       // int even=0,odd=1;
        int sumEven=num.charAt(0)-'0',sumOdd=num.charAt(1)-'0';
        for(int i=2;i<num.length()-1;i++){
            sumEven+=num.charAt(i)-'0';
            sumOdd=num.charAt(i+1)-'0';
        }
        return sumEven==sumOdd?true:false;
    }
   
}
