package invertTree;

public class invertTree {
	public TreeNode invertTree(TreeNode root) {
        While(root.right!=null||root.left!=null){
        TreeNode tmp= new TreeNode(0);
        tmp=root.left;
        root.left=root.right;
        root.right=tmp;
        invertTree(root.left);
        invertTree(root.right);
        }
       
        return root;
    }
}
