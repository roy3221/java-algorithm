import java.util.*;
public class Solution {
	public int lengthOfLongestSubstring(String s) {
		if(s.length()==1){
			return 1;
		}
		int b=0;
		int res=0;
		boolean flag=false;
		Map<Character,Integer> map= new HashMap<>();
		for(int i=0;i<s.length();i++){
			char letter= s.charAt(i);
			if(!map.containsKey(letter)){
				map.put(letter,i);
				flag=false;
			}else{
				if(res<i-b){
					res=i-b;
					flag=true;
				}
				b=map.get(letter)+1;
				map.put(letter,i);
			}
			System.out.println(map);
			System.out.println("b="+ b);
			System.out.println(flag);
			System.out.println("res="+res);
		}
		System.out.println("b="+ b);
		if(!flag){
			if(res<s.length()-b){
				res=s.length()-b;
			}
		}
		return res;
	}
	public static void main(String ags[]){
		String s="dvdfgds";
		System.out.println(new Solution().lengthOfLongestSubstring(s));
	}
}
