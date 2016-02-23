
public class PathSum {
	public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null) return false;
        List<TreeNode> uv= new LinkedList<TreeNode>();
        List<TreeNode> v= new LinkedList<TreeNode>();
        Deque<TreeNode> node= new ArrayDeque<TreeNode>();
        int result=0;
        while(root.left!=null||root.right!=null){
             node.addFirst(root);
             v.add(root);
             result=root.val;
             if(root.left!=null&&root.right!=null){
                 uv.add(root);
             }
            while(root.left!=null){
                node.addFirst(root.left);
                v.add(root);
                result+=root.left.val;
                root=root.left;
                if(root.left!=null&&root.right!=null){
                 uv.add(root);
             }
            }
            while(root.right!=null){
                node.addFirst(root.right);
                v.add(root);
                result+=root.right.val;
                root=root.right;
                if(root.left!=null&&root.right!=null){
                 uv.add(root);
             }
            }
          if(result==sum) return true;
        }
        while(uv.size()!=0){
            while(!uv.contains(node.getFirst())){
                result-=root.val;
                node.removeFirst();
            }
            root=node.getFirst();
            while(root.left!=null||root.right!=null){
                uv.remove(root);
                if(!v.contains(root.left)){
                        while(root.left!=null){
                        node.addFirst(root.left);
                        result+=root.left.val;
                        root=root.left;
                        v.add(root);
                        if(root.left!=null&&root.right!=null){
                 uv.add(root);
             }
                    }
                    while(root.right!=null){
                        node.addFirst(root.right);
                        result+=root.right.val;
                        root=root.right;
                        v.add(root);
                        if(root.left!=null&&root.right!=null){
                 uv.add(root);
             }
                    }
                }
                if(!v.contains(root.right)){
                    while(root.left!=null){
                        node.addFirst(root.left);
                        result+=root.left.val;
                        root=root.left;
                        v.add(root);
                        if(root.left!=null&&root.right!=null){
                 uv.add(root);
             }
                    }
                    while(root.right!=null){
                        node.addFirst(root.right);
                        result+=root.right.val;
                        root=root.right;
                        v.add(root);
                        if(root.left!=null&&root.right!=null){
                 uv.add(root);
             }
                    }
                }
                if(result==sum) return true;
            }
            
        }
        return false;
    }
}
