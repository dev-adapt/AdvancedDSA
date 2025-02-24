package BINARY_SEARCH_TREE;

public class validateBST {
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
        // static TreeNode prev=null;
        // //static boolean flag=true;
        // public void inorder(TreeNode root,boolean[]flag){
        //     if(root==null)return;
        //     inorder(root.left,flag);
        //     if(prev==null)prev=root;
        //     else if(root.val<=prev.val){ 
        //         flag[0]=false;
        //         return;
    
        //     }else{
        //         prev=root;
        //     }
        //     inorder(root.right,flag);
        // }
        // public boolean isValidBST(TreeNode root) {
        //     boolean[]flag=new boolean[1];
        //     flag[0]=true;
        //     prev=null;
        //     inorder(root,flag);
        //     return flag[0];
        // }

        public boolean isValidBST(TreeNode root) {
            if(root==null)return true;
            return isValidateBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
        }
        public boolean isValidateBST(TreeNode root,long min,long max) {
            if(root==null)return true;
            if(root.val<=min || root.val>=max)return false;
            return isValidateBST(root.left, min, root.val) && isValidateBST(root.right,root.val , max);
        }
}
