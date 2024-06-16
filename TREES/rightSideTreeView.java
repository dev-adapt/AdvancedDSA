package TREES;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class rightSideTreeView {
    public static class TreeNode{
        int val;
        TreeNode left, right;
        public TreeNode(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    } 
    public static int height(TreeNode root){
        if(root==null ||(root.left==null && root.right==null))return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }
    public static void preOrder(TreeNode root,List<Integer>ans,int level){
        if(root==null)return;
        ans.set(level-1,root.val);
        preOrder(root.left, ans, level+1);
        preOrder(root.right, ans, level+1);
    }
   static List<Integer> rightSideView(TreeNode root) {
        List<Integer>ans=new ArrayList<>();
        if(root==null)return ans;
        int level=height(root)+1;
        for(int i=0;i<level;i++){
            ans.add(1);
        }
        preOrder(root, ans, 1);
        return ans;
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
    public static void main(String[] args) {
        String arr[]={"1","2","3","","5","","4"};
       TreeNode root= constructBfs(arr);
       List<Integer>ans=rightSideView(root);
       System.out.println(ans);
    }
}
