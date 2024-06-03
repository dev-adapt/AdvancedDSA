package leetcodeJUNE;

public class uniqueChar {
    static int firstUniqChar(String s) {
        char arr[]= s.toCharArray();
        int freq[]=new int[26];
        for(int i=0;i<arr.length;i++){
            int ascii=(int)arr[i];
            freq[ascii-97]++;
        }
        for(int i=0;i<arr.length;i++){
            int ascii=(int)arr[i];
            if(freq[ascii-97]==1)return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        String s="leetcode";
        System.out.println(firstUniqChar(s));
    }
}
