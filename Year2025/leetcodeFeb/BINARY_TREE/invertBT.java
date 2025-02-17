package BINARY_TREE;

import BINARY_TREE.balancedBT.TreeNode;

public class invertBT {
    public TreeNode inversion(TreeNode root){
        if(root == null) return root;
       TreeNode l=root.left;
       TreeNode r=root.right;
       root.left = inversion(r);
       root.right = inversion(l);
       return root;

    }
}
