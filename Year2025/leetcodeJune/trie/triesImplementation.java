package Year2025.leetcodeJune.trie;

public class triesImplementation {
    public class Trie{
        static class Node{
            Node links[]=new Node[26];
            boolean flag=false;
            boolean containsKey(char ch){
                return links[ch-'a'] != null;
            }
            void put(char ch, Node node){
                links[ch-'a']=node;
            }
            Node get(char ch){
                return links[ch-'a'];
            }
            void setEnd(){
                flag=true;
            }
            boolean isEnd(){
                return flag;
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
            }
            node.setEnd();
        }
        public boolean Search(String s){
            Node node=root;
            for(int i=0;i<s.length();i++){
                if(!node.containsKey(s.charAt(i)))return false;
                node=node.get(s.charAt(i));
            }
            return node.isEnd();
        }
        public boolean startsWith (String prefix){
            Node node=root;
            for(int i=0;i<prefix.length();i++){
                if(!node.containsKey(prefix.charAt(i)))return false;
                node=node.get(prefix.charAt(i));
            }
            return true;
        }
    }
}
