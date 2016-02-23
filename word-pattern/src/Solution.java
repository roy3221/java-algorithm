import java.util.*;
public class Solution {
    public boolean wordPattern(String pattern, String str) {
    	List<String> words= new ArrayList<>();
    	int pat_len=pattern.length();
    	String[] word= str.split(" ");
    	int str_len=word.length;
    	if(str_len!=pat_len){
			System.out.println("00000");
			return false;

    	}
    	Map<Object,Integer> index= new HashMap<>();
    	for(int i=0;i<str_len;i++){
    		char p= pattern.charAt(i);
    		String w= word[i];
    		if(index.containsKey(p)!=index.containsKey(w)){
    			System.out.println("11111");
    			return false;
    		}
    		if(index.containsKey(p)){
    			if(index.get(p)!=index.get(w)){
        			System.out.println("2222");
    				return false;
    			}
    			
    		}else{
    			index.put(p, i);
    			index.put(w, i);
    		}
    		
    	}
		return true;
    }
    public static void main(String args[]){
    	String pattern = "aaaa";
    	String str = "dog cat cat dog";
    	System.out.println( new Solution().wordPattern(pattern, str));
    }
}
