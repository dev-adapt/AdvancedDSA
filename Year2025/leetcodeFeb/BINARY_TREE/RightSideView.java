package BINARY_TREE;

import java.util.ArrayList;
import java.util.List;

public class RightSideView {
    public List<Integer> rightsideView(Node root) {
        // List to store the result
        List<Integer> res = new ArrayList<>();

        // Call the recursive function
        // to populate the right-side view
        recursionRight(root, 0, res);

        return res;
    }

    // Function to return the Left view of the binary tree
    public List<Integer> leftsideView(Node root) {
        // List to store the result
        List<Integer> res = new ArrayList<>();

        // Call the recursive function
        // to populate the left-side view
        recursionLeft(root, 0, res);

        return res;
    }

    // Recursive function to traverse the
    // binary tree and populate the left-side view
    private void recursionLeft(Node root, int level, List<Integer> res) {
        // Check if the current node is null
        if (root == null) {
            return;
        }

        // Check if the size of the result list
        // is equal to the current level
        if (res.size() == level) {
            // If equal, add the value of the
            // current node to the result list
            res.add(root.data);
        }

        // Recursively call the function for the
        // left child with an increased level
        recursionLeft(root.left, level + 1, res);

        // Recursively call the function for the
        // right child with an increased level
        recursionLeft(root.right, level + 1, res);
    }

    // Recursive function to traverse the
    // binary tree and populate the right-side view
    private void recursionRight(Node root, int level, List<Integer> res) {
        // Check if the current node is null
        if (root == null) {
            return;
        }

        // Check if the size of the result list
        // is equal to the current level
        if (res.size() == level) {
            // If equal, add the value of the
            // current node to the result list
            res.add(root.data);

            // Recursively call the function for the
            // right child with an increased level
            recursionRight(root.right, level + 1, res);

            // Recursively call the function for the
            // left child with an increased level
            recursionRight(root.left, level + 1, res);
        }
    }

}
