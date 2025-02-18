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
    
        if (root == null) {
            return;
        }

        // Check if the size of the result list
        // is equal to the current level
        if (res.size() == level) {
            // If equal, add the value of the
            // current node to the result list
            res.add(root.val);

            // Recursively call the function for the
            // right child with an increased level
            recursionRight(root.right, level + 1, res);

            // Recursively call the function for the
            // left child with an increased level
            recursionRight(root.left, level + 1, res);
        }
    }

}
