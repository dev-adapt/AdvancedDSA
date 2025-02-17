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
        int height=height(root)+1;
        for(int i=1height){
            if(i&1==0)
        }
    }
    public int height(TreeNode root){
        if(root == null) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }
}
