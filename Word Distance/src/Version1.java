//Given a list of words and two words word1 and word2, return the shortest distance between these two words in the list.
//
//For example,
//Assume that words = ["practice", "makes", "perfect", "coding", "makes"].
//
//Given word1 = “coding”, word2 = “practice”, return 3.
//Given word1 = "makes", word2 = "coding", return 1.


public class Version1 {

	public int shortestDistance(String[] words, String word1, String word2) {
        int shortestDistance = Integer.MAX_VALUE;
        int position1 =  Integer.MAX_VALUE;
        int position2 =  Integer.MAX_VALUE;
        for(int i = 0; i < words.length; i++) {
            if(words[i].equals(word1)) position1 = i;
            if(words[i].equals(word2)) position2 = i;
            if(position1 != position2) shortestDistance = Math.min(shortestDistance, Math.abs(position2 - position1));
        }
        return shortestDistance;
    }
	
}
