package BINARY_TREE;

import java.util.ArrayList;
import java.util.List;

public class RightSideView {
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
    public List<Integer> rightsideView( TreeNode root) {
       
        List<Integer> res = new ArrayList<>();
        recursionRight(root, 0, res);
        return res;
    }

    private void recursionRight( TreeNode root, int level, List<Integer> res) {
    
        if (root == null) 
            return;
      
        if (res.size() == level)  res.add(root.val);

            recursionRight(root.right, level + 1, res);

            recursionRight(root.left, level + 1, res);
        
    }

}
