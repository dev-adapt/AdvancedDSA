package BINARY_TREE;

public class diameterOfBT {
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
    public int maxDepth(TreeNode root,int[] dia) {
        if(root==null)return 0;
         int[] leftAns = new int[1];
        int[]   rightAns= new int[1];
         leftAns[0]=maxDepth(root.left,dia);
        rightAns[0]=maxDepth(root.right,dia);
        dia[0]=Math.max(dia[0],(leftAns[0]+rightAns[0]));
        return 1+Math.max(leftAns[0],rightAns[0]);
    }
    public int diameterOfBinaryTree(TreeNode root) {
       int[] dia=new int[1];
       dia[0]=0;
        maxDepth(root,dia);
        return dia[0];
    }
}
