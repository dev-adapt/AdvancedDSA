package BINARY_TREE;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util. Map;

public class topViewBinary  {
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
    public class    Node {
            int val;
               Node left;
               Node right;
               Node() {}
               Node(int val) { this.val = val; }
               Node(int val,    Node left,    Node right) {
                this.val = val;
                this.left = left;
                this.right = right;
            }
        }
         public List<Integer> topView(  Node root) {
        // List to store the result
        List<Integer> ans = new ArrayList<>();
        
        // Check if the tree is empty
        if (root == null) {
            return ans;
        }
        
        // Map to store the top view nodes
        // based on their vertical positions
        Map<Integer, Integer> mpp = new  Map<>();
        
        // Queue for BFS traversal, each element
        // is a pair containing node 
        // and its vertical position
        Queue<Pair<  Node, Integer>> q = new LinkedList<>();
        
        // Push the root node with its vertical
        // position (0) into the queue
        q.add(new Pair<>(root, 0));
        
        // BFS traversal
        while (!q.isEmpty()) {
            // Retrieve the node and its vertical
            // position from the front of the queue
            Pair<  Node, Integer> pair = q.poll();
              Node node = pair.getKey();
            int line = pair.getValue();
            
            // If the vertical position is not already
            // in the map, add the node's data to the map
            if (!mpp.containsKey(line)) {
                mpp.put(line, node.data);
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
