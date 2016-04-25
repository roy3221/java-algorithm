package wordLadder;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Set;

public class Solution {
	public int ladderLength(String beginWord, String endWord, Set<String> wordList) {
        Deque<String> queue = new ArrayDeque<String>();
        queue.addLast(beginWord);
        int level = 1;
        while(!queue.isEmpty()) {
            int levelSize = queue.size();
            for(int k = 0; k < levelSize; k++){
                String curWord = queue.removeFirst();
                for(int i = 0; i < curWord.length(); i ++) {
                    char[] chs = curWord.toCharArray();
                    for(char c = 'a'; c <= 'z'; c++) {
                        chs[i] = c;
                        String newWord = new String(chs);
                        if(newWord.equals(endWord)) return level+1;
                        if(wordList.contains(newWord)){
                            queue.addLast(newWord);
                            wordList.remove(newWord);
                        }
                    }
                }
            }
            level++;
        }
        return 0;
    }

}
