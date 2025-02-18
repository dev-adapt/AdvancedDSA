package BINARY_TREE;

import java.util.*;

public class maxWidthOfBinaryTree {
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
    class Pair{
        TreeNode node;
        int num;

        Pair(TreeNode node, int num){
            node=this.node;
            num=this.num;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        int ans=0;
        Queue<Pair>q=new LinkedList<>();
        q.add(new Pair(root,0));
        int mmin=0;
        int size=q.size();
        int first=0,last=0;
        while(!q.isEmpty()){
            
        }
        return ans;
    }
}
