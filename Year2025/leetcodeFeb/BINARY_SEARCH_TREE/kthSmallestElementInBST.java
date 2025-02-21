package BINARY_SEARCH_TREE;
import java.util.*;
public class kthSmallestElementInBST {
    public class TreeNode {
            int val;
            TreeNode left;
            TreeNode right;
            TreeNode() {}
            TreeNode(int val) { this.val = val; }
            TreeNode(int val, TreeNode left, TreeNode right) {
                this.val = val;
                this.left = left;
                this.right = right;
            }
        }
    public int kthSmallest(TreeNode root, int k) {
        //inorder of bst gives sorted array result

        if(root==null )return -1;
        int count=0;
        Stack<TreeNode>st=new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            TreeNode temp=st.peek();
            if(temp.left!=null){
                st.push(temp.left);
                temp.left=null;
            }else{
                st.pop();
                count++;
                if(count==k)return temp.val;
                if(temp.right!=null)st.push(temp.right);
            }
        }
        return -1;
    }
}
