package BINARY_TREE;
import java.util.*;

public class verticalOrderTraversalOfBinaryTree {

    //  TreeNode class for the binary tree
    static class  TreeNode {
        int data;
         TreeNode left;
         TreeNode right;

        // Constructor to initialize the node with a value
        public  TreeNode(int val) {
            data = val;
            left = null;
            right = null;
        }
    }

    // Pair class to store two values
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

    // Function to perform vertical order traversal
    public List<List<Integer>> findVertical( TreeNode root) {
        // Map to store nodes based on vertical and level information
        Map<Integer, Map<Integer, TreeSet<Integer>>> nodes = new TreeMap<>();

        // Queue for BFS traversal, each element is a pair containing node and its vertical and level information
        Queue<Pair< TreeNode, Pair<Integer, Integer>>> todo = new LinkedList<>();

        // Push the root node with initial vertical and level values (0, 0)
        todo.add(new Pair<>(root, new Pair<>(0, 0)));

        // BFS traversal
        while (!todo.isEmpty()) {
            // Retrieve the node and its vertical and level information from the front of the queue
            Pair< TreeNode, Pair<Integer, Integer>> p = todo.poll();
             TreeNode temp = p.getKey();

            // Extract the vertical and level information
            int x = p.getValue().getKey(); // Vertical
            int y = p.getValue().getValue(); // Level

            // Insert the node value into the corresponding vertical and level in the map
            nodes.computeIfAbsent(x, k -> new TreeMap<>())
                 .computeIfAbsent(y, k -> new TreeSet<>())
                 .add(temp.data);

            // Process left child
            if (temp.left != null) {
                todo.add(new Pair<>(temp.left, new Pair<>(x - 1, y + 1)));
            }

            // Process right child
            if (temp.right != null) {
                todo.add(new Pair<>(temp.right, new Pair<>(x + 1, y + 1)));
            }
        }

        // Prepare the final result list by combining values from the map
        List<List<Integer>> ans = new ArrayList<>();
        for (Map.Entry<Integer, Map<Integer, TreeSet<Integer>>> entry : nodes.entrySet()) {
            List<Integer> col = new ArrayList<>();
            for (TreeSet<Integer> set : entry.getValue().values()) {
                col.addAll(set);
            }
            ans.add(col);
        }
        return ans;
    }

    // Helper function to print the result
   

    
}

                            
                        

