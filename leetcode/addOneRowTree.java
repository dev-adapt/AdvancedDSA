package leetcode;
import java.util.*;
public class addOneRowTree {
    static TreeNode add(TreeNode root,int val,int depth,int curr){
        if(depth-1==curr){
       
            TreeNode ltemp=root.left;
            root.left=new TreeNode(val);
            root.left.left=ltemp;
            //right side
            TreeNode rtemp=root.right;
            root.right=new TreeNode(val);
            root.right.right=rtemp;

            return root;
        }else{
            add(root.left, val, depth, curr+1);
            add(root.right, val, depth, curr+1);
        }
        return root;

    }
    static TreeNode addingRow(TreeNode root,int val,int depth){
       if(depth==1){
        TreeNode newRoot =new TreeNode(val);
        newRoot.left=root;
        return newRoot;
       }
       int curr=1;
       add(root,val,depth,curr);
       return root;
    }
   
    static void bfs(TreeNode root){
        Queue<TreeNode> q=new LinkedList<>();
        if(root!=null)q.add(root);
        while(q.size()>0){
            TreeNode temp=q.peek();
            if(temp.left!=null)q.add(temp.left);
            if(temp.right!=null)q.add(temp.right);
            System.out.print(temp.val+" ");
            q.remove();
        }

    }
    public static class TreeNode{
        int val;
        TreeNode left, right;
        public TreeNode(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
       //       1
        //     /   \
        //    2     3
        //  /   \  /  \
        // 4    5  8   9
        //     /        \
        //    6          7
    
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.right.left = new TreeNode(6);
        root.right.left = new TreeNode(8);
        root.right.right = new TreeNode(9);
        root.right.right.right = new TreeNode(7);
        int val=1;
        int depth=2;
        bfs(root);
        addingRow(root, val, depth);
        System.out.println();
        bfs(root);
    }
}
