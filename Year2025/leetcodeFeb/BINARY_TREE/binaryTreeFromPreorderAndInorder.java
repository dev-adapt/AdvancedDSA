package BINARY_TREE;

public class binaryTreeFromPreorderAndInorder {
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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n=preorder.length;
        return helper(preorder, 0, n-1, inorder, 0, n-1);
    }
    TreeNode helper(int[]preorder,int prelo,int prehi,int[]inorder,int inlo,int inhi){
        if(prelo>prehi ||inlo>inhi)return null;
        TreeNode root=new TreeNode(preorder[prelo]);
        int i=0;
        while(preorder[prelo]!=inorder[i])i++;

        int ls=i-inlo;
        root.left=helper(preorder, prelo+1, prelo+ls, inorder, inlo, i-1);
        root.right=helper(preorder, prelo+ls+1, prehi, inorder, i+1, inhi);
        return root;
    }
}
