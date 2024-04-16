package leetcode;

public class sumRootToLeaf {
   
     static int total;
    
    static int sumNumbers(Node root) {
        total = 0;
        helper(root, 0);
        return total;
    }
    
     static void helper(Node root, int sum) {
        if (root == null) return;
        
        sum = sum * 10 + root.val;
        
        if (root.left == null && root.right == null) {
            total += sum;
            return;
        }
        
        helper(root.left, sum);
        helper(root.right, sum);
    }
    public static class Node{
        int val;
        Node left, right;
        public Node(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
       //       1
        //     /   \
        //    2     3
        //  /   \  /  \
        // 4    5  8   9
        //     /        \
        //    6          7
    
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(6);
        root.right.left = new Node(8);
        root.right.right = new Node(9);
        root.right.right.right = new Node(7);
        System.out.println(sumNumbers(root));
    }
}
