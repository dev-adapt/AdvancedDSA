package Year2025.leetcodeJune.String;

public class reverseWord {
   
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] strArr = s.split(" ");
        for(int idx = strArr.length - 1; idx >= 0; idx--){
            if(!strArr[idx].trim().isEmpty()){
                sb.append(strArr[idx].trim());
                sb.append(" ");
            }

        }
        return sb.toString().trim();
    }

}
