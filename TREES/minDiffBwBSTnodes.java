package TREES;

public class minDiffBwBSTnodes {
    public class   TreeNode {
        int val;
          TreeNode left, right;
        public  TreeNode (int val){
            this.val = val;
            this.left = null;
            this.right = null;
              }
          }
          // static TreeNode prev=null;
    public int minDiffInBST(TreeNode root) {
        int[]minDiff=new int[1];
        TreeNode[]prev=new TreeNode[1];
        minDiff[0]=Integer.MAX_VALUE;
        prev[0]=null;
        inorder(root, minDiff, prev);
        return minDiff[0];

    }
    public void inorder(TreeNode root, int[]minDiff,TreeNode[]prev){
        if(root==null)return;
        inorder(root.left, minDiff, prev);
        if(prev[0]!=null){
            int diff=Math.abs(prev[0].val-root.val);
            minDiff[0]=Math.min(diff, minDiff[0]);
        }
        prev[0]=root;
        inorder(root.right, minDiff, prev);
    }
}
