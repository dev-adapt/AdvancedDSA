package BINARY_TREE;

public class flatternBinaryTree {
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
        //NORMAL METHOD WITH TC(O(N)) AND SC(O(N))
    public void flatten(TreeNode root) {
        if(root==null)return;
        TreeNode leftTree = root.left;
        TreeNode rightTree = root.right;
         root.left=null;
         flatten(leftTree);
         flatten(rightTree);
        root.right=leftTree;
         TreeNode temp=leftTree;
         while(temp!=null && temp.right!=null)temp=temp.right;
         if(temp!=null)temp.right=rightTree;
        else root.right=rightTree;

        return;
    }
    //USING MORRIS TRAVERSAL SC(O(N))
    public void flatten2(TreeNode root){
        if(root==null)return ;
        TreeNode c=root;
        while(c!=null){
            if(c.left!=null){
                TreeNode pre=c.left;
                while(pre.right!=null)pre=pre.right;

                pre.right=c.right;
                c.right=c.left;
                c.left=null;
            }
           
            c=c.right;
        }
        return;
    } 
}
