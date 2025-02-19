package BINARY_TREE;

import java.util.*;

public class nodeAtDistancek {
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
       public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Map<TreeNode,TreeNode>parent_track=new HashMap<>();

    }
    private void getParent(TreeNode root, Map<TreeNode,TreeNode>parent_track){
        if(root==null) return;
        if(root.left!=null){
            parent_track.put(root.left,root);
        }
        if(root.right!=null)root.put
    }
}
