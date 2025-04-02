package Year2025.leetcodeApril.GRAPHS;

import java.util.*;

public class wordLadder {
    class pair{
        String first;
        int sec;
        public pair(String first,int sec){
            this.first=first;
            this.sec=sec;
        }
    }
        public int ladderLength(String beginWord, String endWord, List<String> wordList) {
         Queue<pair>q=new LinkedList<>();
         q.add(new pair(beginWord,1));
         Set<String>st=new HashSet<>();
         for(int i=0;i<wordList.size();i++)st.add(wordList.get(i));

         st.remove(beginWord);
         while(!q.isEmpty()){
            pair p=q.poll();
            String word=p.first;
            int steps=p.sec;
            if(word.equals(endWord)==true)return steps;
            for(int i=0;i<word.length();i++){
                for(char ch='a';ch<='z';ch++){
                    char [] replacedWord=word.toCharArray();
                    replacedWord[i]=ch;
                    String newWord=new String(replacedWord);
                    if(st.contains(newWord)==true){
                        q.add(new pair(newWord,steps+1));
                        st.remove(newWord);
                    }
                }
            }
         }
         return 0;
    }
}
