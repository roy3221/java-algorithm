package stringCompress;

import java.util.Scanner;

public class compress {
	
	public String compr(String input){
		String mystr="";
		int count=0;
		char last =input.charAt(0);
		for(int i=0; i<input.length();i++){
			if(input.charAt(i)==last){
				count++;
			}else{
				mystr+=last+""+count;
				last=input.charAt(i);
				count=1;
			}
			
		}
	return mystr+last+count;

		}
	@SuppressWarnings("resource")
	public static void main(String args[]){
		compress co= new compress();
		Scanner sc= new Scanner(System.in);
		String input=sc.nextLine();
		String output=co.compr(input);
		System.out.println(output);
		
	}
}
