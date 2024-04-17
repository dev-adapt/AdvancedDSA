package leetcode;

public class smallestString {
    static String smallestStringFromLeaf(TreeNode root){
       StringBuilder smallest=new StringBuilder();
       dfs(root, new StringBuilder(),smallest);
       return smallest.toString();
    }
    private static void dfs(TreeNode root,StringBuilder path,StringBuilder smallest){
        if(root==null)return;
        path.append((char)('a'+root.val));

        if(root.left==null && root.right==null){
            String currStr=path.reverse().toString();
            if(smallest.length()==0||currStr.compareTo(smallest.toString())<0){ //if currStr < smallest
                smallest.setLength(0);
                smallest.append(currStr);
            }
            path.reverse();
        }
        dfs(root.left,path,smallest);
        dfs(root.right, path, smallest);

        path.setLength(path.length()-1); //backtrack : remove the current node's character from the path
    }
    public static class TreeNode{
        int val;
        TreeNode left, right;
        public TreeNode(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
       //       1                           b                           
        //     /   \                      /   \ 
        //    2     3                   c       d
        //  /   \  /  \                /   \   /  \
        // 4    5  8   9             e      f i    j
        //     /        \                 /         \
        //    6          7               g           h
      // answer must be ecb
    
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.right.left = new TreeNode(6);
        root.right.left = new TreeNode(8);
        root.right.right = new TreeNode(9);
        root.right.right.right = new TreeNode(7);
        System.out.println(smallestStringFromLeaf(root));
    }
}
