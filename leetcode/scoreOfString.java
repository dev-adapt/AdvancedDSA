package leetcode;

public class scoreOfString {
    static int score(String s){
        int ans=0;
        for(int i=0;i<s.length()-1;i++){
            char curr=s.charAt(i);
            char next=s.charAt(i+1);
            int num1=(int)curr;
            int num2=(int)next;
            ans+=Math.abs(num1-num2);
        }
        return ans;
    }
    public static void main(String[] args) {
        String s="hello";
        System.out.println(score(s));
    }
}
