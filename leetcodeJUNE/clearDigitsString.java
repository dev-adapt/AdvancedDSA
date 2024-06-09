package leetcodeJUNE;

public class clearDigitsString {
    static  String clearDigits(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<s.length();i++) {
            char currentChar=s.charAt(i);
            if (!Character.isDigit(currentChar)) {
                sb.append(currentChar);
            } else {
                int j=i-1;
                while (j>=0&& Character.isDigit(s.charAt(j))) {
                    j--;
                }
                i=j+1;
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "abc";
        System.out.println(clearDigits(s));
    }
}
