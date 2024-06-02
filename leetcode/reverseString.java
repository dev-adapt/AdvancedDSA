package leetcode;

public class reverseString {
    static void reverse(char[] s) {
       int i=0,j=s.length-1;
       while(i<j){
        char temp=s[i];
        s[i]=s[j];
        s[j]=temp;
        i++;
        j--;
       }
    }
    public static void main(String[] args) {
        char[] s={'h','e','l','l','o'};
        System.out.println(s);
        reverse(s);
        System.out.println(s);
    }
}
