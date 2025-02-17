package BINARY_TREE;

public class symmetricTrees {
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
        public TreeNode inversion(TreeNode root){
            if(root == null) return root;
           TreeNode l=root.left;
           TreeNode r=root.right;
           root.left = inversion(r);
           root.right = inversion(l);
           return root;
    
        }
    public boolean isSymmetric(TreeNode root){
        root.left=inversion(root.right);
        return isSameTree(root.left, root.right);
    }
    public boolean isSameTree(TreeNode p,TreeNode q){
        if(p==null && q==null)return  true;
        if(p==null||q==null)return false;
        if(p.val!=q.val)return false;
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}
