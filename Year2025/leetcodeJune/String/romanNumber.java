package Year2025.leetcodeJune.String;

import java.util.HashMap;

public class romanNumber {
    public int romanToInt(String s) {
        HashMap<Character,Integer>mp=new HashMap<>();  //MCMXCIV
        mp.put('I',1);
        mp.put('V',5);
        mp.put('X',10);
        mp.put('L',50);
        mp.put('C',100);
        mp.put('D',500);
        mp.put('M',1000);
        int ans=0;
        int n=s.length();
       for(int i=n-1;i>=0;i--){
        if(i-1>=0){
            if(mp.get(s.charAt(i))>mp.get(s.charAt(i-1))){
                ans+=mp.get(s.charAt(i))-mp.get(s.charAt(i-1));
            }else{
                ans+=mp.get(s.charAt(i));
            }
        }
       }
       return ans;
    }
}
