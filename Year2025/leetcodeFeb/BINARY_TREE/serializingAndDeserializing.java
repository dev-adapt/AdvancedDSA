package BINARY_TREE;

import java.util.LinkedList;
import java.util.Queue;

public class serializingAndDeserializing {
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
        public String serialize(TreeNode root) {
            if (root == null) {
                return "";
            }
    
            StringBuilder sb = new StringBuilder();
            Queue<TreeNode> q = new LinkedList<>();
            q.offer(root);
    
            while (!q.isEmpty()) {
                TreeNode curNode = q.poll();
                if (curNode == null) {
                    sb.append("#,");
                } else {
                    sb.append(curNode.val).append(",");  // Append value
                    q.offer(curNode.left);
                    q.offer(curNode.right);
                }
            }
            return sb.toString();
        }
    
        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            if (data.isEmpty()) {
                return null;
            }
    
            String[] nodes = data.split(",");
            Queue<TreeNode> q = new LinkedList<>();
    
            TreeNode root = new TreeNode(Integer.parseInt(nodes[0]));
            q.offer(root);
    
            int i = 1;
            while (!q.isEmpty()) {
                TreeNode node = q.poll();
    
                if (!nodes[i].equals("#")) {
                    node.left = new TreeNode(Integer.parseInt(nodes[i]));
                    q.offer(node.left);
                }
                i++;
    
                if (!nodes[i].equals("#")) {
                    node.right = new TreeNode(Integer.parseInt(nodes[i]));
                    q.offer(node.right);
                }
                i++;
            }
            return root;
        }
 
}
