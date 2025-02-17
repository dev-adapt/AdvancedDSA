package BINARY_TREE;

public class boundaryTraversal {
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
        public void boundaryDisplay(TreeNode root){
            if(root==null )return;
            leftBoundary(root);
            bottomBoundary(root);
            rightBoundary(root);
        }
        public void leftBoundary(TreeNode root){
            if(root==null)return;
            if(root.left==null && root.right==null)return;
            System.out.println(root.val);
            if(root.left!=null)leftBoundary(root.left);
            else leftBoundary(root.right);
        }
        public void bottomBoundary(TreeNode root){
            if(root==null)return;
            if(root.left==null && root.right==null)return;
        }
        public void rightBoundary(TreeNode root){
            if(root==null)return;
            if(root.left==null && root.right==null)return;
            System.out.println(root.val);
            if(root.right!=null)rightBoundary(root.right);
            else rightBoundary(root.left);
        }
}
