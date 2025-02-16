package BINARY_TREE;
public class balancedBT {

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
    public int maxDepth(TreeNode root) {
      if(root==null)return 0;
      if(root.left==null && root.right==null)return 1;
      int leftAns=maxDepth(root.left);
      int rightAns=maxDepth(root.right);
      return 1+Math.max(leftAns,rightAns);
  }
  public boolean isBalanced(TreeNode root) {
      if(root==null)return true;
      int heightLeft=maxDepth(root.left);
     // if(root.left!=null)heightLeft++;
      int heightRight=maxDepth(root.right);
    //  if(root.right!=null)heightRight++;
      int d=heightLeft-heightRight;
      if(d<0)d=-d;
      if(d>1)return false;
      return (isBalanced(root.left)&&isBalanced(root.right));

  }
}