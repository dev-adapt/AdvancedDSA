package leetcodeAugustAndSeptember;

import java.util.HashSet;

public class consistentString {
    public static int countConsistentStrings(String allowed, String[] words) {
       HashSet<Character>set=new HashSet<>();
       for(int i=0;i<allowed.length();i++)set.add(allowed.charAt(i));
        int count=0;
       for(String i:words){
        HashSet<Character>prime=new HashSet<>(set);
        HashSet<Character>check=new HashSet<>();
        for(int idx=0;idx<i.length();idx++)check.add(i.charAt(idx));
        prime.addAll(check);
        if(set.equals(prime))count++;
       }
       return count;
    }
   public static void main(String[] args) {
    String allowed = "ab";
    String[] words = {"ad","bd","aaab","baa","badab"};
    System.out.println(countConsistentStrings(allowed, words));
  
   } 
}
