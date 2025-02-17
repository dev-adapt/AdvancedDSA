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
     public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        int len=height(root)+1;
        List<List<Integer>>ans=new ArrayList<List<Integer>>();
        for(int i=1;i<=len;i++){
            List<Integer>arr=new ArrayList<>();
            if((i&1)==0)
            nthLevel(root, len, arr);
            else nthLevel2(root, len, arr);

            ans.add(arr);
        }
        return ans;
    }
    public int height(TreeNode root){
        if(root == null) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }
    public void nthLevel(TreeNode root,int n,List<Integer>arr){
        if(root == null) return;
        if(n == 1){ 
          arr.add(root.val);
          return;
         }
         nthLevel(root.left,n-1, arr);
         nthLevel(root.right, n, arr);
    }
    public void nthLevel2(TreeNode root,int n,List<Integer>arr){
        if(root == null) return;
        if(n == 1){ 
          arr.add(root.val);
          return;
         }
        
         nthLevel(root.right, n, arr);
         nthLevel(root.left,n-1, arr);
    }
}
