package balancedBinaryTree;

public class balancedBinaryTree {
	public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
            if(Math.abs(height(root.left)-height(root.right))>1)
             return false;
            if(isBalanced(root.left)==false) return false;
            if(isBalanced(root.right)==false) return false;
        return true;
        }
    public int height(TreeNode root){
        int height=1;
        if(root==null) return 0;
        height+= height(root.left)>height(root.right)? height(root.left):height(root.right);
        return height;
    }
    public class TreeNode {
    	      int val;
    	      TreeNode left;
    	      TreeNode right;
    	      TreeNode(int x) { val = x; }
    	  }

}
