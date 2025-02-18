package BINARY_TREE;

import java.util.*;

public class maxWidthOfBinaryTree {
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
    class Pair{
        TreeNode node;
        int num;

        Pair(TreeNode node, long num){
            node=this.node;
            num=this.num;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        // int ans=0;
        // Queue<Pair>q=new LinkedList<>();
        // q.add(new Pair(root,0));
       
        // while(!q.isEmpty()){
            
        //     int mmin=q.peek().num;
        //     int size=q.size();
        //     int first=0,last=0;
        //     for(int i=0;i<size;i++){
        //         int curr_id=q.peek().num-mmin;
        //         TreeNode node=q.peek().node;
        //         q.poll();

        //         if(i==0)first=curr_id;
        //         if(i==size-1)last=curr_id;

        //         if(node.left!=null)q.offer(new Pair(root.left,2*curr_id+1));
        //         if(node.right!=null)q.offer(new Pair(root.right,2*curr_id+2));
        //     }
        //     ans=Math.max(ans,last-first+1);
        // }
        // return ans;
        if (root == null) return 0;

        int ans = 0;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));

        while (!q.isEmpty()) {
            int size = q.size();
            long mmin = q.peek().num; // Normalize indices to prevent overflow
            long first = 0, last = 0;

            for (int i = 0; i < size; i++) {
                Pair temp = q.poll();
                TreeNode node = temp.node;
                long curr_id = temp.num - mmin;  // Normalize index

                if (i == 0) first = curr_id;
                if (i == size - 1) last = curr_id;

                if (node.left != null) q.offer(new Pair(node.left, 2 * curr_id + 1));
                if (node.right != null) q.offer(new Pair(node.right, 2 * curr_id + 2));
            }

            ans = Math.max(ans, (int) (last - first + 1));
        }
        return ans;
    }
}
