package BINARY_SEARCH_TREE;


public class ceilOfBST {
    public class Node {
            int data;
            Node left;
            Node right;
            Node() {}
            Node(int data) { this.data = data; }
            Node(int data, Node left, Node right) {
                this.data = data;
                this.left = left;
                this.right = right;
            }
        }
     int findCeil(Node root, int key) {
        if (root == null) return -1;
        // Code here
        int ans[]=new int[1];
        ans[0]=-1;
        helper(root,key,ans);
        return ans[0];
       
    }
    void helper(Node root, int key,int[] ans){
        if(root==null)return;
        if(root.data==key){
            ans[0]=root.data;
            return;
        }
        if(root.data<key)helper(root.right,key,ans);
        else{
            ans[0]=root.data;
            helper(root.left,key,ans);
        }
        return;
    }
}
