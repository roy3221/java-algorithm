import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class GroupShiftedStrings {
	public class Solution {
	    public List<List<String>> groupStrings(String[] strings) {
	        Arrays.sort(strings);
	        Map<String, List<String>> map = new HashMap<>();
	        for(String str : strings) {
	            StringBuilder difSum = new StringBuilder();
	            difSum.append(" ");
	            // System.out.println(str);
	            for(int i = 1; str.length() > 1 && i< str.length(); i++) {
	                int dif = str.charAt(i) - str.charAt(i-1);
	                difSum.append((dif+26)%26);
	                // System.out.println(difSum);
	            }
	            String key = difSum.toString();
	            // System.out.println("key = "+ key);
	            if(!map.containsKey(key)) map.put(key, new ArrayList<String>());
	            map.get(key).add(str);
	        }
	        // System.out.println(map.entrySet());
	        return new ArrayList<List<String>>(map.values());
	    }
	}

	// The point of this problem is how to create a string as a unqiue key for each sequence. 
}
