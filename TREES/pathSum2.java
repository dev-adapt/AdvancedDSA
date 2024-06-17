package TREES;

import java.util.*;

public class pathSum2 {
   
    public static class    TreeNode {
        int val;
           TreeNode left,right;
        public   TreeNode (int val){
            this.val = val;
            this.left = null;
            this.right = null;
              }
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
  
    public static List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>arr=new ArrayList<>();
        helper(ans, arr, root, targetSum);
        return ans; 
    };
    
    public static void helper(List<List<Integer>>ans,List<Integer>arr,TreeNode root,int sum){
        if(root==null)return;
        if(root.left==null && root.right==null){
            arr.add(root.val);
            if(root.val==sum){
                List<Integer>a=new ArrayList<>();
                for(int i=0;i<arr.size()-1;i++){
                    a.add(arr.get(i));
                }
                ans.add(a);
            }
            arr.remove(arr.size()-1);
            return;
        }
        arr.add(root.val);
        helper(ans, arr, root.left, sum-root.val);
        helper(ans, arr, root.right, sum-root.val);
        arr.remove(arr.size()-1);
    }
    public static void main(String[] args) {
        String[]str= {"5","4","8","11","","13","4","7","2","","","5","1"};
        int targetSum = 22;
        TreeNode root=constructBfs(str);
        List<List<Integer>> list=pathSum(root, targetSum);
        System.out.println(list);
    }
}
