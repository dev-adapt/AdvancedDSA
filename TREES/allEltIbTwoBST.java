package TREES;

import java.util.ArrayList;
import java.util.List;

public class allEltIbTwoBST {
    public class   TreeNode {
        int val;
          TreeNode left, right;
        public  TreeNode (int val){
            this.val = val;
            this.left = null;
            this.right = null;
              }
          }
          public void inorder(TreeNode root, List<Integer>list){
            if(root==null)return;
            inorder(root.left, list);
            list.add(root.val);
            inorder(root.right, list);
          }
        public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
            List<Integer> tree1=new ArrayList<>();
            inorder(root1,tree1);
            List<Integer> tree2=new ArrayList<>();
            inorder(root2, tree2);
            List<Integer> ans=new ArrayList<>();
            int n=tree1.size();
            int m=tree2.size();
            int i=0,j=0;
            while(i<n || j<m){
                int num1=tree1.get(i);
                int num2=tree2.get(j);
                if(num1<num2){
                    ans.add(num1);
                    i++;
                }else{
                    ans.add(num2);
                    j++;
                }
            }
            while(i<n){
                ans.add(tree1.get(i));
                i++;
            }
            while(j<m){
                ans.add(tree2.get(j));
                j++;
            }
            return ans;
    }  
}
