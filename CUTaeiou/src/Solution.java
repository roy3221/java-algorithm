
public class Solution {
public static String CutAEIOU(String s){
	StringBuffer sb= new StringBuffer();
	String comp="aeiouAEIOU";
	for(int i=0;i<s.length();i++){
		if(comp.indexOf(s.charAt(i))<0) sb.append(s.charAt(i));
	}
	return sb.toString();
}
public static void main(String args[]){
	System.out.println(Solution.CutAEIOU("abcde asdf wer"));
}
}
