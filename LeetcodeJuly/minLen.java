public class minLen {
    public int minimumLength(String s) {
       int[]freq=new int[26];
       for(int i=0;i<s.length();i++){
        freq[s.charAt(i)-'a']++;
       }
       int length=0;
       for(int i=0;i<freq.length;i++){
        while(freq[i]>=3){
            freq[i]-=2;
        }
        length+=freq[i];
       }
       return length;
    }
}
