package backtracking;

import java.util.ArrayList;
import java.util.List;

public class Palindrome_Partitioning {
	public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        getPartition(s, res, new ArrayList<String>(), 0);
        return res;
    }
    
    private void getPartition(String s, List<List<String>> res, List<String> partition, int index) {
        if (index == s.length()) {
            res.add(new ArrayList<String>(partition));
            return;
        }
        for(int i = index; i < s.length(); i++) {
            if(isPalindrome(s, index, i)) {
                partition.add(s.substring(index,i+1));
                getPartition(s,res,partition, i+1);
                partition.remove(partition.size()-1);
            }
        }
    }
    
    private boolean isPalindrome(String s, int low, int high) {
        char[] chs = s.toCharArray();
        while(low < high) {
           if(chs[low++] != chs[high--] ) return false;
        }
        return true;
    }
}
