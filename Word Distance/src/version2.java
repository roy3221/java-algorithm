import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


//This is a follow up of Shortest Word Distance. The only difference is now you are given the list of words and your method will be called repeatedly many times with different parameters. How would you optimize it?
//
//Design a class which receives a list of words in the constructor, and implements a method that takes two words word1 and word2 and return the shortest distance between these two words in the list.
//
//For example,
//Assume that words = ["practice", "makes", "perfect", "coding", "makes"].
//
//Given word1 = “coding”, word2 = “practice”, return 3.
//Given word1 = "makes", word2 = "coding", return 1.
//
//Note:
//You may assume that word1 does not equal to word2, and word1 and word2 are both in the list.

public class version2 {
	
	// public class WordDistance {
//  String[] words;
//  Map<String, Set<Integer>> words_Position; // we can also use arraylist, which will record the order of positions.
//  public WordDistance(String[] words) {
//      this.words = words;
//      words_Position = new HashMap<>();
//      for(int i = 0; i < words.length; i++) {
//          if(!words_Position.containsKey(words[i])) words_Position.put(words[i], new HashSet<Integer>());
//          words_Position.get(words[i]).add(i);
//      }
//      System.out.println(words_Position);
     
//  }

//  public int shortest(String word1, String word2) {
//                      System.out.println("word1 = "+word1+"; word2 = "+word2);

//      int shortestDistance = Integer.MAX_VALUE;
//      Iterator i1 = words_Position.get(word1).iterator();
//    /* while(i1.hasNext()) {
//          int p1 = (int) i1.next();
//          Iterator i2 = words_Position.get(word2).iterator();
//          while(i2.hasNext()){
//              int p2 = (int)i2.next();
//              shortestDistance = Math.min(shortestDistance, Math.abs(p1 - p2));
//          }
//      }*/
//      for(int p1 : words_Position.get(word1)) {
//          for(int p2 : words_Position.get(word2)) {
//              shortestDistance = Math.min(shortestDistance, Math.abs(p1 - p2));
//          }
//      }
//      return shortestDistance;
//  }
//}

public class WordDistance {

private Map<String, List<Integer>> map;

public WordDistance(String[] words) {
 map = new HashMap<String, List<Integer>>();
 for(int i = 0; i < words.length; i++) {
     String w = words[i];
     if(map.containsKey(w)) {
         map.get(w).add(i);
     } else {
         List<Integer> list = new ArrayList<Integer>();
         list.add(i);
         map.put(w, list);
     }
 }
}

public int shortest(String word1, String word2) {
 List<Integer> list1 = map.get(word1);
 List<Integer> list2 = map.get(word2);
 int ret = Integer.MAX_VALUE;
 for(int i = 0, j = 0; i < list1.size() && j < list2.size(); ) {
     int index1 = list1.get(i), index2 = list2.get(j);
     if(index1 < index2) {
         ret = Math.min(ret, index2 - index1);
         i++;
     } else {
         ret = Math.min(ret, index1 - index2);
         j++;
     }
 }
 return ret;
}
}

//Your WordDistance object will be instantiated and called as such:
//WordDistance wordDistance = new WordDistance(words);
//wordDistance.shortest("word1", "word2");
//wordDistance.shortest("anotherWord1", "anotherWord2");

}
