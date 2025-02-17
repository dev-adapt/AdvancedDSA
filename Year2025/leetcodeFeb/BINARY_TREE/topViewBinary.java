package BINARY_TREE;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class topViewBinary {
    class Pair<T, U> {
        T first;
        U second;

        public Pair(T first, U second) {
            this.first = first;
            this.second = second;
        }

        public T getKey() {
            return first;
        }

        public U getValue() {
            return second;
        }
    }
    public class  TreeNode {
            int val;
             TreeNode left;
             TreeNode right;
             TreeNode() {}
             TreeNode(int val) { this.val = val; }
             TreeNode(int val,  TreeNode left,  TreeNode right) {
                this.val = val;
                this.left = left;
                this.right = right;
            }
        }
         public List<Integer> topView( TreeNode root) {
       
        List<Integer> ans = new ArrayList<>();
        
        if (root == null) 
            return ans;
      
        // Map to store the top view nodesbased on their vertical positions
        Map<Integer, Integer> mpp = new TreeMap<>();
        
        // Queue for BFS traversal, each element
        // is a pair containing node 
        // and its vertical position
        Queue<Pair< TreeNode, Integer>> q = new LinkedList<>();
        
        // Push the root node with its vertical
        // position (0) into the queue
        q.add(new Pair<>(root, 0));
        
        // BFS traversal
        while (!q.isEmpty()) {
            // Retrieve the node and its vertical
            // position from the front of the queue
            Pair< TreeNode, Integer> pair = q.poll();
             TreeNode node = pair.getKey();
            int line = pair.getValue();
            
            // If the vertical position is not already
            // in the map, add the node's  val to the map
            if (!mpp.containsKey(line)) {
                mpp.put(line, node. val);
            }
            
            // Process left child
            if (node.left != null) {
                // Push the left child with a decreased
                // vertical position into the queue
                q.add(new Pair<>(node.left, line - 1));
            }
            
            // Process right child
            if (node.right != null) {
                // Push the right child with an increased
                // vertical position into the queue
                q.add(new Pair<>(node.right, line + 1));
            }
        }
        
        // Transfer values from the
        // map to the result list
        for (int value : mpp.values()) {
            ans.add(value);
        }
        
        return ans;
    }
}
