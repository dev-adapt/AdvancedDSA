package BINARY_TREE;
import java.util.*;
public class binaryTreePaths {
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
    public List<String> paths(TreeNode root){
        List<String>ans=new ArrayList<>() ;
        helper(root, ans, "");
        return ans;
    }
    public void helper(TreeNode root,List<String>ans,String s){
        if(root.left==null && root.right==null){
            s+=root.val;
            ans.add(s);
        }
        if(root.left!=null){
            helper(root.left,ans,s+root.val+"->");
        }
        if(root.right!=null){
            helper(root.right,ans,s+root.val+"->");
        }
    }
}
