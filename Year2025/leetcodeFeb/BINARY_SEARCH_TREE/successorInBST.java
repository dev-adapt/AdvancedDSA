package BINARY_SEARCH_TREE;
 class TreeNode {
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
public class successorInBST {
  
        public static TreeNode inorderSuccessor(TreeNode root,TreeNode p){
            TreeNode[]succssor=new TreeNode[1];
            succssor[0]=null;
            helper(root, p, succssor);
            return succssor[0];
        }
       public static void helper (TreeNode root,TreeNode p,TreeNode[]succssor){
        if(root==null) return;
            if(root.val==p.val)return;
            else if(root.val<p.val){
                helper(root.right, p, succssor);
            }else{
                succssor[0]=root;
                helper(root.left, p, succssor);
            }
        }
        public static void main(String[] args) {
            TreeNode a=new TreeNode(1);
            TreeNode b=new TreeNode(2);
            TreeNode c=new TreeNode(3);
            TreeNode d=new TreeNode(4);
            TreeNode e=new TreeNode(5);
            TreeNode f=new TreeNode(6);
            TreeNode g=new TreeNode(7);
            TreeNode h=new TreeNode(8);
            TreeNode i=new TreeNode(9);
            TreeNode j=new TreeNode(10);

            e.left=b;
            b.left=a;
            b.right=d;
            d.left=c;
            e.right=g;
            g.left=f;
            g.right=i;
            i.left=h;
            i.right=j;
           TreeNode ans= inorderSuccessor( e,  c);
           System.out.println(ans.val);
        }
}
