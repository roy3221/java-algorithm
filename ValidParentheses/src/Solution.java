
public class Solution {

	    public boolean isValid(String s) {
	        if(s == null || s.length()%2 == 1) return false;
	        Stack<Character> firstParts = new Stack<>();
	        for(int i = 0; i < s.length(); i++) {
	            if(s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '(') {
	                firstParts.push(s.charAt(i));
	            }else {
	                if(firstParts.isEmpty()) {
	                    return false;
	                }
	                else if(s.charAt(i) == ']' && firstParts.pop() != '['){
	                    return false;
	                }
	                else if(s.charAt(i) == '}' && firstParts.pop() != '{'){
	                    return false;
	                }
	                else if(s.charAt(i) == ')' && firstParts.pop() != '('){
	                    return false;
	                } 
	            }
	        }
	        return firstParts.isEmpty();
	    }
	}
