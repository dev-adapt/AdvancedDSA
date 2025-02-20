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
                q.offer(curNode.left);
                q.offer(curNode.right);
            }
        }
        return sb.toString();
    }
 
    public TreeNode deserialize(String data) {
        if (data.isEmpty()) {
            return null;
        }

        StringBuilder s = new StringBuilder(data);
        //kuki values bohot badi tabhi aese comma ke basis pe pata kar rhe hai value ka
        int commaIndex = s.indexOf(",");
        String str = s.substring(0, commaIndex);
        s.delete(0, commaIndex + 1);
        TreeNode root = new TreeNode(Integer.parseInt(str));

        Queue<TreeNode> q = new LinkedList<>();
  
        q.offer(root);

        while (!q.isEmpty()) {
           
            TreeNode node = q.poll();

            commaIndex = s.indexOf(",");
            str = s.substring(0, commaIndex);
            s.delete(0, commaIndex + 1);
       
            if (!str.equals("#")) {
                TreeNode leftNode = new TreeNode(Integer.parseInt(str));
                node.left = leftNode;
                q.offer(leftNode);
            }

            commaIndex = s.indexOf(",");
            str = s.substring(0, commaIndex);
            s.delete(0, commaIndex + 1);
         
            if (!str.equals("#")) {
                TreeNode rightNode = new TreeNode(Integer.parseInt(str));
                node.right = rightNode;
                q.offer(rightNode);
            }
        }
        return root;
    }
}
