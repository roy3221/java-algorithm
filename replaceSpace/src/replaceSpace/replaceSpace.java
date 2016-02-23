package replaceSpace;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class replaceSpace {
	int count=0;
	String output="";
	@SuppressWarnings("unchecked")
	public String replace(String input){
		@SuppressWarnings("rawtypes")
		ArrayList<String> str= new ArrayList();
		for(int i=0;i<input.length();i++){
			str.add(i,Character.toString(input.charAt(i)));
			System.out.println(str);
			System.out.println("~~~~~~~~~~~~~");
		}
		System.out.println(str.get(0));
		for(int i=0;i<input.length();i++){
			System.out.println("************");
			if(str.get(i)=="h" ){
				System.out.println("!!!!!!!!!!!!!!!!!");
				str.set(i,"change");
			}
			output+=str.get(i);

		}
		System.out.println(output);
		System.out.println("$$$$$$$$$$$$");

	return output;
	}

	@SuppressWarnings("resource")
	public static void main(String args[]){
		replaceSpace re= new replaceSpace();
	    System.out.println("Please enter input string");
		Scanner sc= new Scanner(System.in);
		String input=sc.nextLine();
		String output=re.replace(input);
	    System.out.println("The output string is:");
		System.out.println(output);
	}
}
