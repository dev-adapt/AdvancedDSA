package TREES;

public class deleteNodeInBST {
    public class   TreeNode {
        int val;
          TreeNode left, right;
        public  TreeNode (int val){
            this.val = val;
            this.left = null;
            this.right = null;
              }
          }
    public void delete(TreeNode root,int target){
        if(root==null)return;
        if(root.val>target){
            if(root.left==null)return;

            if(root.left.val==target){
                TreeNode l=root.left;
            if(l.left==null && l.right==null)root.left=null;
            else if(l.left==null || l.right==null){
                if(l.left!=null)root.left=l.left;
                else root.left=l.right;
            }else{
               TreeNode curr=l;
               TreeNode pred=curr.left;
               while(pred.right!=null)pred=pred.right;
               delete(root,pred.val);
                pred.left=curr.left;
                pred.right=curr.right;
                root.left=pred;
            }
           }else delete(root.left, target);
        }else{
            if(root.right==null)return;

            if(root.right.val==target){
                TreeNode l=root.right;
            if(l.left==null && l.right==null)root.right=null;
            else if(l.left==null || l.right==null){
                if(l.left!=null)root.right=l.left;
                else root.right=l.right;
            }else{
               TreeNode curr=l;
               TreeNode pred=curr.left;
               while(pred.right!=null)pred=pred.right;
               delete(root,pred.val);
                pred.left=curr.left;
                pred.right=curr.right;
                root.right=pred;
            }
           }else delete(root.right, target);
        }
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        TreeNode temp =new TreeNode(Integer.MAX_VALUE);
        temp.left=root;
        delete(temp, key);
        root=temp.left;
        return root;
    }
}
