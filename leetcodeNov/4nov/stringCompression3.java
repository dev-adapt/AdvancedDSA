public class stringCompression3 {
    public static String compressedString(String s) {
        StringBuilder str=new StringBuilder("");
        int idx=1,n=s.length();
        char prev=s.charAt(0);
        int count=1;
        while(idx<n){
            if(s.charAt(idx)==prev &&count<9) count++;
            else{
                str.append(count);
                str.append(prev);
                prev=s.charAt(idx);
                count=1;
            }
            idx++;
        }
        str.append(count);
        str.append(prev);
        return str.toString();
    }
    public static void main(String[] args) {
        String s="aaaaaaaaaaaaaaabbbcc";
        System.out.println(compressedString(s));
    }
}
