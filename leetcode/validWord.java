package leetcode;
public class validWord {
    static boolean valid(String s){
     int digit=0,vowel=0,cons=0,character=0;
        if(s.length()<=2){
          //  System.out.println("fuck"+s.length());
            return false;   
        }
        for(int i=0;i<s.length();i++){
            char curr=s.charAt(i);
            int num=(int)curr; 
if(curr=='A'||curr=='a'||curr=='E'||curr=='e'||curr=='i'||curr=='I'||curr=='o'||curr=='O'||curr=='u'||curr=='U')vowel++;

       else if((num>=65&& num<=90)||(num>=97&& num<=122)&&(curr!='A'||curr!='a'||curr!='E'||curr!='e'||curr!='i'||curr!='I'||curr!='o'||curr!='O'||curr!='u'||curr!='U'))cons++;

       else  if(curr=='$'||curr=='#'||curr=='@')character++;
      else if(num>=48 && num<=57)digit++;
        }
      System.out.println(vowel+" "+cons+" "+character+" "+digit);
        if(vowel>0&&cons>0&&character==0){
          return true;
        }
     return false;
    }
     // System.out.println(vowel+" "+cons+" "+character+" "+digit);
       // if(digit>=0&&vowel>0&&cons>0&&character>=0)return true;
//     It contains a minimum of 3 characters.
// It consists of the digits 0-9, and the uppercase and lowercase English letters. (Not necessary to have all of them.)
// It includes at least one vowel.
// It includes at least one consonant
    public static void main(String[] args) {
        String s="#zwI";
        System.out.println(valid(s));
    }
}

