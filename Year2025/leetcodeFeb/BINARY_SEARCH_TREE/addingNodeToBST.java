package BINARY_SEARCH_TREE;

public class addingNodeToBST {
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
        public TreeNode insertIntoBST(TreeNode root, int val) {
            if(root==null){
                 TreeNode node=new TreeNode(val);
                return node;
            }
            helper(root, val);
            return root;
        }
        public void helper(TreeNode root,int val){
            if(root.val>val && root.left!=null){
                helper(root.left, val);
            }else if(root.val>val && root.left==null){
                TreeNode node=new TreeNode(val);
                root.left=node;
                return;
            }
            if(root.val<val && root.right!=null){
                helper(root.right, val);
            }else if(root.val<val && root.right==null){
                TreeNode node=new TreeNode(val);
                root.right=node;
                return;
            }
            return;
        }
}
