package leetcodeJUNE;
//2486
public class appendString {
    static  int appendCharacters(String s, String t) {
       int sLength=s.length(),tLength=t.length();
       int sIdx=0, tIdx=0;
        while(sIdx<sLength && tIdx<tLength){
            if(s.charAt(sIdx)==t.charAt(tIdx))
                tIdx++;
            sIdx++;
        }
        return tLength-tIdx;
        
    }
    public static void main(String[] args) {
        String s="coaching", t = "coding";
        System.out.println(appendCharacters(s, t));
    }
}
