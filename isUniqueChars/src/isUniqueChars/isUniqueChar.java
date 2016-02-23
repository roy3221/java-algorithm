package isUniqueChars;

import java.util.Scanner;

public class isUniqueChar {
	public boolean isUniqueChars(String str){
		if(str.length()>256)
			return false;
		boolean[] char_set= new boolean[256];
		for(int i=0; i<str.length(); i++){
			int val=str.charAt(i);
			if(char_set[val]){
				return false;
			}
			char_set[val]=true;
		}
		return true;
	}
	@SuppressWarnings("resource")
	public static void main(String args[]){
		isUniqueChar t1= new isUniqueChar();
		System.out.println("please enter your strings");
		Scanner s = new Scanner(System.in);
		 String str = s.next();
		System.out.println(t1.isUniqueChars(str));
	}
}
