package leetcode;
//import java.util.*;

public class validParanthesis{
    static boolean checkValidString(String s) {
        int open=0,close=0,star=0;
        for(int i=0;i<s.length();i++){
            char curr=s.charAt(i);
            if(curr=='(')open++;
           else if(curr==')')close++;
            else star++;
        }
        if(open-close==0)return true;
        else 
            if((open!=0&&close!=0)&&(close-open==1||open-close==1))return true;
         else
          if(open-close==star-1||close-open==star-1)return true;

       else return false;
     }
        
    public static void main(String[] args) {
        String s="(*))";
        System.out.println(checkValidString(s));
    }
}