import java.util.HashSet;
import java.util.Set;

public class Solution {

	private Set<Set<UndirectedGraphNode>> visited = new HashSet<>();
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        
        return CloneNode(node);
    }   
    private UndirectedGraphNode CloneNode (UndirectedGraphNode node){
        System.out.println("run");
    	if( node == null)
            return null;
        UndirectedGraphNode newNode = new UndirectedGraphNode(node.label);
        for (UndirectedGraphNode neighbor : node.neighbors) {
            newNode.neighbors.add(neighbor);
        }
        if(!newNode.neighbors.isEmpty()){
            for( UndirectedGraphNode neighbor : newNode.neighbors){
            System.out.println(neighbor.label);
            Set<UndirectedGraphNode> edge = new HashSet<>();
            edge.add(node);
            edge.add(newNode);
            if(visited.contains(edge))
                continue;
            visited.add(edge);
            CloneNode(neighbor);
            }
        }
        return newNode;
    }
}
