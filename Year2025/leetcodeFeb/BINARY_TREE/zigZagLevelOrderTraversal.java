package BINARY_TREE;

import java.util.List;

public class zigZagLevelOrderTraversal {
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
     public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        int len=height(root)+1;
        List<List<Integer>>
        for(int i=1;i<len;i++){
            if((i&1)==0)

            else 
        }
    }
    public int height(TreeNode root){
        if(root == null) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }
    public void nthLevel(TreeNode root,int n,List<Integer>arr){

    }
}
