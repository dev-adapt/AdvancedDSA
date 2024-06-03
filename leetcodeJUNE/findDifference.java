package leetcodeJUNE;
//389
public class findDifference {

    static  char findTheDifference(String s, String t) {
        int arrS[]=new int [26];
        int arrT[]=new int [26];
        for(int i=0;i<s.length();i++){
            int asciiS=(int)s.charAt(i);
            int asciiT=(int)t.charAt(i);
            arrS[asciiS-97]++;
            arrT[asciiT-97]++;
    }
    int ascii=(int)t.charAt(t.length()-1);
    arrT[ascii-97]++;
    int ans=97;
    for(int i=0;i<arrS.length;i++){
        if(Math.abs(arrS[i]-arrT[i])==1)  ans+=i;
    }
    return (char)ans;
}
    public static void main(String[] args) {
       String s = "abcd", t = "abcde";
       System.out.println(findTheDifference(s, t));
    }
}
