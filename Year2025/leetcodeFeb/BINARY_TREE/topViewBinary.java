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
      
        Map<Integer, Integer> mpp = new TreeMap<>(); // Map to store the top view nodes based on their vertical positions
        
        // Queue for BFS traversal, each element is a pair containing node  and its vertical position
        Queue<Pair< TreeNode, Integer>> q = new LinkedList<>();
     
        q.add(new Pair<>(root, 0));
     
        while (!q.isEmpty()) {
           
            Pair< TreeNode, Integer> pair = q.poll();
             TreeNode node = pair.getKey();
            int line = pair.getValue();
            
            // If the vertical position is not already in the map, add the node's  val to the map
            if (!mpp.containsKey(line)) {
                mpp.put(line, node. val);
            }else{
                mpp.
            }
            
            // Process left child
            if (node.left != null) {
                q.add(new Pair<>(node.left, line - 1));
            }
            
            // Process right child
            if (node.right != null) {
                 q.add(new Pair<>(node.right, line + 1));
            }
        }
        for (int value : mpp.values()) {
            ans.add(value);
        }
        
        return ans;
    }
}
