package TREES;

import java.util.LinkedList;
import java.util.Queue;

public class pathSum1 {
    public static class    TreeNode {
        int val;
           TreeNode left,right;
        public   TreeNode (int val){
            this.val = val;
            this.left = null;
            this.right = null;
              }
          }
          static void nthLevel( TreeNode root , int n){
        if(root==null)return;
        if(n==1) {
           System.out.print(root.val +" ");
            return;
        }
        nthLevel(root.left,n-1);
        nthLevel(root.right,n-1);
    }
    static int height( TreeNode root){
        if(root==null ||(root.left==null && root.right==null))return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }

    static TreeNode constructBfs(String []arr){
        int x=Integer.parseInt(arr[0]);
        int n=arr.length;
        TreeNode root =new TreeNode(x);
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int i=1;
        while(i<n-1){
            TreeNode temp=q.remove();
            TreeNode left=new TreeNode(0);
            TreeNode right=new TreeNode(0);
            if(arr[i].equals(""))
                left=null;
            
            else{
                int l=Integer.parseInt(arr[i]);
                left.val=l;
                q.add(left);
            }
            if(arr[i+1].equals(""))
                right=null;
             else{
                int r=Integer.parseInt(arr[i+1]);
                right.val=r;
                q.add(right);
            }
            temp.left=left;
            temp.right=right;
            i=i+2;
        }
        return root;
    }
          static boolean hasPathSum( TreeNode root, int targetSum) {
            if(root==null)return false;
           if(root!=null &&root.left==null && root.right==null) {
            if(root.val==targetSum)return true;
           }
           return hasPathSum(root.left, targetSum-root.val) || hasPathSum(root.right, targetSum-root.val);
        }
          public static void main(String[] args) {
            String arr[] = {"5","4","8","11","","13","4","7","2","","","","1"};
            int targetSum = 22;
            TreeNode root=constructBfs(arr);
            System.out.println(hasPathSum(root, targetSum));
        int level=height(root)+1;
        for(int i=1;i<=level;i++){
            nthLevel(root, i);
            System.out.println();
        }
          }
}
