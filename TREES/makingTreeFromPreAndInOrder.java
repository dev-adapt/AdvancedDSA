package TREES;

public class makingTreeFromPreAndInOrder {
    public static class   TreeNode {
        int val;
          TreeNode left, right;
        public  TreeNode (int val){
            this.val = val;
            this.left = null;
            this.right = null;
              }
          }
          static void nthLevel(  TreeNode root , int n){
            if(root==null)return;
            if(n==1) {
               System.out.print(root.val +" ");
                return;
            }
            nthLevel(root.left,n-1);
            nthLevel(root.right,n-1);
        }
        static int height(  TreeNode root){
            if(root==null ||(root.left==null && root.right==null))return 0;
            return 1+Math.max(height(root.left),height(root.right));
        }
          static   TreeNode buildTree(int[] preorder, int[] inorder) {
            int n=preorder.length;
            return helper(preorder, 0,n-1, inorder, 0, n-1);
          }
          static   TreeNode helper(int[]preorder,int prelo,int prehi,int[]inorder,int inlo,int inhi){
              TreeNode root=new   TreeNode (preorder[prelo]);
            if(prelo>prehi)return null;
            int i=inlo;
            while(inorder[i]!=preorder[prelo])i++;
            int ls=i-inlo;
            root.left=helper(preorder, prelo+1,prelo+ls, inorder, inlo,i-1);
            root.right=helper(preorder, prelo+ls+1, prehi, inorder, i+1, inhi);
             return root;
          }
          public static void main(String[] args) {
           int[] preorder = {3,9,20,15,7}, inorder = {9,3,15,20,7};
             TreeNode root= buildTree(preorder, inorder);
            int level=height(root)+1;
            for(int i=1;i<=level;i++){
                nthLevel(root, i);
                System.out.println();
            }
      
          }
}
