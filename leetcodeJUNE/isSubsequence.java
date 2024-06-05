package leetcodeJUNE;

public class isSubsequence {
    static  boolean isSubsequence(String s, String t) {
        int idx=0;
        if(s.length()==0)return true;
        if(s.length()==1 && t.length()==1 &&s.charAt(0)!=t.charAt(0))return false;
        for(int i=0;i<t.length();i++){
            if(idx<s.length() &&s.charAt(idx)==t.charAt(i))idx++;
        }
        if(idx==s.length())return true;
        return false;
    }
    public static void main(String[] args) {
        String s = "b", t = "abcc";
        System.out.println(isSubsequence(s, t));
        int n=225;

    }
}

