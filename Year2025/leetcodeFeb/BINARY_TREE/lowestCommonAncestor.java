package BINARY_TREE;

public class lowestCommonAncestor {
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
        public boolean contains(TreeNode root,TreeNode node){
            if(root==node)return true;
            if(root==null)return false;
           return  contains(root.left,node)||contains(root.right,node);
        }
        public TreeNode LCA(TreeNode root,TreeNode p,TreeNode q){
            if(p==root && q==root)return root;
            if(p==q)return p;
            boolean leftPart=contains(root, p);
            boolean rightPart=contains(root, q);
            if((leftPart && rightPart)&& (!leftPart && !rightPart))return root;
            if(leftPart)return LCA(root.left,p,q);
            if(rightPart)return LCA(root.right,p,q);
            return null;

        }
}
