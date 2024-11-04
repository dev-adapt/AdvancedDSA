//package leetcodeNov.2nov;

public class fancyString {
    public static String makeFancyString(String s) {
        int[]freq=new int[26];
        for(int i=0;i<s.length();i++){
            int curr=s.charAt(i)-'a';
            freq[curr]++;
        }
        StringBuilder sb=new StringBuilder(s);
        int i=1;
       while(i<=sb.length()-2){
        System.out.println(i);
            char curr=sb.charAt(i);
            if(freq[curr-'a']<=2)i++;
            else{
                if(curr==sb.charAt(i-1)&&curr==sb.charAt(i+1))sb.deleteCharAt(i);
                else i++;
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s="leeetcode";
        System.out.println(makeFancyString(s));
    }
}
