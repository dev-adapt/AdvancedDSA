package leetcode;

//import java.util.*;
public class remove_k_digits {
    static String removeKdigits(String num, int k) {
        StringBuilder str = new StringBuilder(num);
       // System.out.println(str.length());
       if(str.length()==1 && k==1)return"0";
        while (k != 0 && str.length() > 1) {
            char first = str.charAt(0);
            char sec = str.charAt(1);
            char last=str.charAt(str.length()-1);
           // System.out.println(last);
            if(str.length()>=3 && k>=1){
               
                if(last>first && last>sec)str.deleteCharAt(2);
                else{
                    if (first > sec ) {
                        str.deleteCharAt(0);
                    } else {
                        str.deleteCharAt(1);
                    }
                   }
            }
           else{
            if (first > sec ) {
                str.deleteCharAt(0);
            } else {
                str.deleteCharAt(1);
            }
           }
            k--;
        }
        
        while(str.length()>0&&str.charAt(0) == '0')
            str.deleteCharAt(0);
        if (str.length() == 0)
            str.append("0");
        String s = new String(str);
        return s;
    }

    public static void main(String[] args) {
        String num = "1173";
        int k = 2;
        System.out.println(removeKdigits(num, k));

    }
}
