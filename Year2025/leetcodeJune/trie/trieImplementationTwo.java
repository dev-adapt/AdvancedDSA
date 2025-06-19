package Year2025.leetcodeJune.trie;

public class trieImplementationTwo {
 class Trie{
       static class Node{
        Node[]links;
        int cntEndWith;
        int cntPrefix;
        Node(){
            links=new Node[26];
            cntEndWith=0;
            cntPrefix=0;
        }
         boolean containsKey(char ch){
                return links[ch-'a'] != null;
         }
         void put(char ch, Node node){
                links[ch-'a']=node;
         }
         Node get(char ch){
                return links[ch-'a'];
        }
        void increaseEnd(){
            cntEndWith++;
        }
        void increasePrefix(){
            cntPrefix++;
        }
        void reducePRefix(){
            cntPrefix--;
        }
        void deleteEnd(){
            cntEndWith--;
        }
    }
     private Node root;
     public Trie(){
            root=new Node();
        }
        public void insert(String s){
            Node node=root;
            for(int i=0;i<s.length();i++){
                if(!node.containsKey(s.charAt(i))){
                    node.put(s.charAt(i), new Node());
                }
                node=node.get(s.charAt(i));
                node.increasePrefix();
            }
            node.increaseEnd();
        }

        int countWordsEqualTo(String s){
            Node node=root;
            for(int i=0;i<s.length();i++){
                if(node.containsKey(s.charAt(i))){
                    node=node.get(s.charAt(i));
                }else return 0;
            }
            return node.cntEndWith;
        }

         int countWordsStartingWith(String s){
            Node node=root;
            for(int i=0;i<s.length();i++){
                if(node.containsKey(s.charAt(i))){
                    node=node.get(s.charAt(i));
                }else return 0;
            }
            return node.cntPrefix;
        }

        void erase(String s){
            Node node=root;
            for(int i=0;i<s.length();i++){
                if(node.containsKey(s.charAt(i))){
                    node=node.get(s.charAt(i));
                    node.reducePRefix();
                }else return ;
            }
            node.deleteEnd();
        }
 }
}
