package Year2025.leetcodeApril.GRAPHS;

import java.util.*;

//import Year2025.leetcodeApril.GRAPHS.wordLadder.pair;

public class wordLadderTwo {
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        Set<String>st=new HashSet<>();
        for(int i=0;i<wordList.size();i++)st.add(wordList.get(i));

        Queue<ArrayList<String>>q=new LinkedList<>();
        ArrayList<String>ls=new ArrayList<>();
        ls.add(beginWord);
        q.add(ls);
        ArrayList<String>usedOnLevel=new ArrayList<>();
        usedOnLevel.add(beginWord);
        int level=0;
       List<List<String>>ans=new ArrayList<>();
        while(!q.isEmpty()){
            ArrayList<String>vec=q.poll();

            if(vec.size()>level){
                level++;
                for(String it:usedOnLevel){
                    st.remove(it);
                }
            }
            String word=vec.get(vec.size()-1);
            if(word.equals(endWord)){
                if(ans.size()==0)ans.add(vec);
                else if(ans.get(0).size()==vec.size())ans.add(vec);
            }
            for(int i=0;i<word.length();i++){
                for(char ch='a';ch<='z';ch++){
                     char [] replacedWord=word.toCharArray();
                    replacedWord[i]=ch;
                    String newWord=new String(replacedWord);
                    if(st.contains(newWord)==true){
                       vec.add(newWord);
                       ArrayList<String>temp=new ArrayList<>(vec);
                       q.add(temp);
                       usedOnLevel.add(newWord);
                       vec.remove(vec.size()-1);
                    }
                }
            }
        }
        return ans;
    }
}
