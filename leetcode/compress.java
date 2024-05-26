package leetcode;

public class compress {
    static String compressString(String s){
       char arr[]= s.toCharArray();
       StringBuilder str=new StringBuilder();
        int idx=0,n=arr.length;
        while(idx<n){
            int count=0;
            char curr=arr[idx];
            while(idx<n && arr[idx]==curr && count<9){
                count++;
                idx++;
            }
            str.append(count);
            str.append(curr);
        }
        return str.toString();
    }
    public static void main(String[] args) {
        String s="abcde";
        System.out.println(compressString(s));
    }
}
// StringBuilder comp = new StringBuilder();
//         int i = 0;
//         while (i < word.length()) {
//             char c = word.charAt(i);
//             int count = 0;
//             while (i < word.length() && word.charAt(i) == c && count < 9) {
//                 count++;
//                 i++;
//             }
//             comp.append(count).append(c);
//         }
//         return comp.toString();
