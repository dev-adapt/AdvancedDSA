package leetcode;

public class countNumberOfSpecialChar {
    static int count(String str){
        int ans=0;
        int capital[]=new int[26];
        int small[]=new int[26];
        for(int i=0;i<str.length();i++){
            //A Z 65-90 a z 97 122
            int ascii=(int)str.charAt(i);
            if(ascii>=65 && ascii<=90)
                capital[ascii-65]=+1;
            else small[ascii-97]=+1;
            
        }
        for(int i=0;i<26;i++){
            if(capital[i]!=0 && small[i]!=0&&capital[i]==small[i])ans+=capital[i];
            else if(capital[i]!=0 && small[i]!=0&&capital[i]!=small[i]){
               if (capital[i]<small[i])ans+=capital[i];
               else ans+=small[i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String str="abBCab";
        System.out.println(count(str));
    }
}
