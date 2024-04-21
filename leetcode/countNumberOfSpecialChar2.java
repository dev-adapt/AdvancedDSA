package leetcode;

public class countNumberOfSpecialChar2 {
    static int count2(String str){
        int ans=0;
        int capital[]=new int[26];
        int small[]=new int[26];
        for(int i=0;i<str.length();i++){
            //A Z 65-90 a z 97 122
            int ascii=(int)str.charAt(i);
            //small
            if(ascii>=97 && ascii<=122){
                if(capital[ascii-97]==0) small[ascii-97]=+1;
                else capital[ascii-97]=-1;

            }//captial
            else if(small[ascii-65]!=0 && capital[ascii-65]>-1){
              if ( capital[ascii-65]<small[ascii-65])capital[ascii-65]+=1;
              else capital[ascii-65]=small[ascii-65];
            }else capital[ascii-65]=-1;
        }
        for(int i=0;i<26;i++){
           if(capital[i]!=0 && small[i]!=0&&capital[i]==small[i])ans+=capital[i];
            else if(capital[i]!=0 && capital[i]>0&&small[i]!=0&&capital[i]!=small[i]){
              ans+=capital[i]-small[i];
            }
        }
        return ans;
              
            
    }
    public static void main(String[] args) {
        String str="AbcbDBdD";
        System.out.println(count2(str));
    }
}
