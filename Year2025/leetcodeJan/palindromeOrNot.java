public class palindromeOrNot {
    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int len=s.length();
        int mid=(len/2);
            String st,end;
        if(len%2==0){
                st=s.substring(0, mid);
                end=s.substring(mid, len);
            }else{
                st=s.substring(0, mid);
                end=s.substring(mid+1, len);
            }
            
            String reversed = new StringBuilder(end).reverse().toString();
        return st.equals(reversed);
    }
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

}
