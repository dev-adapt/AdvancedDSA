package leetcode;

public class anagram {
    static int valid(String s){
        int ans=0;
     char[]arr=s.toCharArray();
     int num[]=new int[26];
     for(int i=0;i<s.length();i++){
        int ascii=(int)arr[i];
        if(ascii>=97 && ascii<=122)num[ascii-97]++;
     }
     for(int i=0;i<num.length;i++){
        if(num[i]!=0)ans++;
     }
        return ans;
    }
    public static void main(String[] args) {
        String s="abba";
        System.out.println(valid(s));
    }
}
