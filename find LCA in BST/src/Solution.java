import java.util.*;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {

	public class TreeNode {
		     int val;
		     TreeNode left;
		     TreeNode right;
		     TreeNode(int x) { val = x; }
		  }
	
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		
        //find the rounte from root to p, and from root to q, compare all the nodes of those two routes, then find out the identical node which is furthest from the root.
      List<Integer> visitedVertex;
      Map<Integer,List<Integer>> path;
      visitedVertex = new ArrayList<>();
      path = new HashMap<>();
      Queue<Integer> queue= new LinkedList<>();
      visitedVertex.add(root.val);
      queue.add(root.val);
      if(false==queue.isEmpty()&&queue.poll()!=p.val&&queue.poll()!=q.val){
    	  queue.add(root.left.val);
    	  queue.add(root.right.val);
    	  visitedVertex.add(root.left.val);
    	  visitedVertex.add(root.right.val);
    	  path.put(key, value)
    	  
      }
        
    }
}
