package leetcode;

public class reversePrefix {
    static String reversePrefixWord(String s,char ch){
        char arr[]=s.toCharArray();
        int idx=0;
        while(idx<arr.length && arr[idx]!=ch)
         idx++;
        if(idx==arr.length)return s;
        int i=0,j=idx;
        while(j>i){
         char temp=arr[j];
         arr[j]=arr[i];
         arr[i]=temp;
         j--;
         i++;
        }
         return String.copyValueOf(arr);
    }
    public static void main(String[] args) {
        String s="abcdefd";
        char ch='z';
        System.out.println(s);
        System.out.println(reversePrefixWord(s, ch));
    }
}
