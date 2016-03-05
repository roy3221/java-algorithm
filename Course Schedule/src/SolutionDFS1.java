import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class SolutionDFS1 {
	    
	     private Map<Integer, Set<Integer>> map = new HashMap<>(); // use a map to store each row. key is the row's first number, value is the other number
	     private Set<Integer> visited = new HashSet<>();
	     private int numCourses;
	    
	    public boolean canFinish(int numCourses, int[][] prerequisites) {
	        visited.clear();
	        this.numCourses = numCourses;
	        for (int[] p : prerequisites) {
	            if (!map.containsKey(p[0])) {
	                map.put(p[0], new HashSet<>());
	            }
	            map.get(p[0]).add(p[1]);// initial the map.
	        }
	        
	        // iterator each key (each courseNode, the first element of each row)
	        while (!map.isEmpty()) {
	            int courseNode = map.keySet().iterator().next();
	            if (hasBackEdge(courseNode)){
	                return false;
	            }
	            if (numCourses-- == 0) 
	                return true;
	        }
	        return true;
	    }
	    
	    // use dfs manner to iterat
	    private boolean hasBackEdge(int courseNode) {

	        if (visited.contains(courseNode)){
	            return true;    
	        } 
	        if (!map.containsKey(courseNode)) {
	            return false;
	        }
	        visited.add(courseNode);
	        
	        // check each courseNode in each row if they have a back edge or not.
	        while (!map.get(courseNode).isEmpty()) {
	            int n = map.get(courseNode).iterator().next();
	            if (hasBackEdge(n)) {
	                return true;
	            }
	            map.get(courseNode).remove(n);
	        }
	        map.remove(courseNode);
	        visited.remove(courseNode);
	        return false;
	    }

}
