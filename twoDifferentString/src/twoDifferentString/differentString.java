package twoDifferentString;

import java.util.Scanner;

public class differentString {
	public boolean isSameString(String str1, String str2){
		if(str1.length()!=str2.length()){
			return false;
		}
		if(str1.length()>256||str2.length()>256)
			return false;
		int[] char_set= new int[256];
		for(int i=0; i<str1.length(); i++){
			int val=str1.charAt(i);
			char_set[val]++;
		}
		for(int i=0; i<str2.length(); i++){
			int val=str2.charAt(i);
			if(--char_set[val]<0){
				return false;
			}
		}
		return true;
	}
	


	@SuppressWarnings("resource")
	public static void main(String args[]){
		differentString test=new differentString();
		System.out.println("Please enter str1");
		Scanner s= new Scanner(System.in);
		String str1=s.nextLine();
		System.out.println("Please enter str2");
		String str2=s.nextLine();
		System.out.println("Same String? ---> "+test.isSameString(str1, str2));

		
	
	}
}