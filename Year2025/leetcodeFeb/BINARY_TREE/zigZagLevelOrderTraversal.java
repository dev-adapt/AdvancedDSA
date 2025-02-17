package BINARY_TREE;

import java.util.ArrayList;
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
        /*
   class Solution {
    public void nthLevel(TreeNode root, int n, List<Integer> arr) {
        if (root == null) return;
        if (n == 1) {
            arr.add(root.val);
            return;
        }
        nthLevel(root.left, n - 1, arr);
        nthLevel(root.right, n - 1, arr);
    }

    public void nthLevel2(TreeNode root, int n, List<Integer> arr) {
        if (root == null) return;
        if (n == 1) {
            arr.add(root.val);
            return;
        }
        nthLevel2(root.right, n - 1, arr);
        nthLevel2(root.left, n - 1, arr);
    }

    public int height(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;
        int level = height(root);  // Fix height calculation
        for (int i = 1; i <= level; i++) {
            List<Integer> arr = new ArrayList<>();
            if ((i & 1) != 0) nthLevel(root, i, arr);
            else nthLevel2(root, i, arr);
            ans.add(arr);
        }
        return ans;
    }
}

         
    //  public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    //     List<List<Integer>>ans=new ArrayList<List<Integer>>();
    //     int len=height(root)+1;
    //     if(root==null)return ans;
       
    //     for(int i=1;i<=len;i++){
    //         List<Integer>arr=new ArrayList<>();
    //         if((i&1)!=0)
    //         nthLevel(root, i, arr);
    //         else nthLevel2(root, i, arr);

    //         ans.add(arr);
    //     }
    //     return ans;
    // }
    // public int height(TreeNode root){
    //     if(root == null ||(root.left==null && root.right==null)) return 0;
    //     return 1 + Math.max(height(root.left), height(root.right));
    // }
    // public void nthLevel(TreeNode root,int n,List<Integer>arr){
    //     if(root == null) return;
    //     if(n == 1){ 
    //       arr.add(root.val);
    //       return;
    //      }
    //      nthLevel(root.left,n-1, arr);
    //      nthLevel(root.right, n-1, arr);
    // }
    // public void nthLevel2(TreeNode root,int n,List<Integer>arr){
    //     if(root == null) return;
    //     if(n == 1){ 
    //       arr.add(root.val);
    //       return;
    //      }
        
    //      nthLevel(root.right, n-1, arr);
    //      nthLevel(root.left,n-1, arr);
    // }
}
