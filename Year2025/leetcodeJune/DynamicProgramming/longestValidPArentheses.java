package Year2025.leetcodeJune.DynamicProgramming;

public class longestValidPArentheses {
     public int longestValidParentheses(String s) {
        return f(s,0,s.length(),0,0);
    }
    private int f(String s,int i,int n,int open,int close){
       
        if(i==n && open==close)return 0;
        else if(i==n && open!=close)return -1;
         int take=0,nottake=0;
         if(s.charAt(i)=='(' && close<=open){
            take=1+f(s,i+1,n,open+1,close);
           
         }else if(s.charAt(i)==')' && close<open){
            take=1+f(s,i+1,n,open,close+1);
           
         }else{
             nottake=f(s, i+1, n, open, close);
         }
         return Math.max(take, nottake);
    }
}
