package BINARY_TREE;

public class childrenSumBinaryTree {
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
        public static int isSumProperty( TreeNoderoot)
        {
            // add your code here
            if(root==null)return 1;
            if(root.left==null && root.right==null)return 1;
            
            int leftData = (root.left != null) ? root.left.data : 0;
            int rightData = (root.right != null) ? root.right.data : 0;
            
            if(root.data == (leftData + rightData)) {
                int left = isSumProperty(root.left);
                int right = isSumProperty(root.right);
                
                if(left == 1 && right == 1) return 1;
            }
            return 0;
            
        }
}
