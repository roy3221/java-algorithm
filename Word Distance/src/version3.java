import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//This is a follow up of Shortest Word Distance. The only difference is now word1 could be the same as word2.
//
//Given a list of words and two words word1 and word2, return the shortest distance between these two words in the list.
//
//word1 and word2 may be the same and they represent two individual words in the list.
//
//For example,
//Assume that words = ["practice", "makes", "perfect", "coding", "makes"].
//
//Given word1 = “makes”, word2 = “coding”, return 1.
//Given word1 = "makes", word2 = "makes", return 3.
//
//Note:
//You may assume word1 and word2 are both in the list.



public class version3 {
	    public int shortestWordDistance(String[] words, String word1, String word2) {
	        Map<String, Set<Integer>> words_Position; // we can also use arraylist, which can be faster when compare positions.
	        int shortestDistance = Integer.MAX_VALUE;
	        words_Position = new HashMap<>();
	        
	        for(int i = 0; i < words.length; i++) {
	            if(!words_Position.containsKey(words[i])) words_Position.put(words[i], new HashSet<Integer>());
	            words_Position.get(words[i]).add(i);
	        }
	        
	        for(int p1 : words_Position.get(word1)) {
	            for(int p2 : words_Position.get(word2)) {
	                if(p1 != p2)
	                shortestDistance = Math.min(shortestDistance, Math.abs(p1 - p2));
	            }
	        }
	        return shortestDistance;
	    }
}
