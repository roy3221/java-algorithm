package testlist;

import java.util.ArrayList;
import java.util.List;

public class test {
	ArrayList<List<Integer>> result= new ArrayList<List<Integer>>();
	public List atry(int a,int b,int c){
		ArrayList<Integer> pass = new ArrayList<Integer>();
		pass.add(a);
		pass.add(b);
		pass.add(c);
		result.add(pass);
		return result;
	}
	public static void main(String args[]){
		test aa= new test();
		System.out.println(aa.atry(1, 2, 3));
	}
}
