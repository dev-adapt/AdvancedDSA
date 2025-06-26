package Year2025.leetcodeJune.GREEDY;

import java.util.Stack;

public class validPArenthesisString {
    public boolean checkValidString(String s) {
        int n=s.length();
        Stack<Character>st=new Stack<>();
        int count=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){
                st.push('(');
            }else if(s.charAt(i)=='*')count++;
            else{
                if(st.isEmpty())return false;
                else st.pop();
            }
        }
        return (st.size()<=count)?true:false;
    }
}

