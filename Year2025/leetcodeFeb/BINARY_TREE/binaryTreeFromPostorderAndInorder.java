package BINARY_TREE;

public class binaryTreeFromPostorderAndInorder {
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
        public TreeNode buildTree(int[] inorder, int[] postorder) {
            int n=inorder.length;
            return helper(inorder, 0, n-1, postorder, 0, n-1);
        }
        private TreeNode helper(int[]inorder,int inlo,int inhi,int[]postorder,int polo,int pohi){
            if(polo>pohi||inlo>inhi)return null;
            TreeNode root=new TreeNode(postorder[pohi]);
            int i=0;
            while(postorder[pohi]!=inorder[i])i++;
            int ls=i-inlo;

            root.left=helper(inorder, inlo, i-1, postorder, polo,polo+ls-1);
            root.right=helper(inorder, i+1, inhi, postorder, polo+ls, pohi-1);
            return root;
        }
}
