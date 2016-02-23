package graycode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	
	public List<Integer> grayCode(int n){
	    List<Integer> ret = new ArrayList<Integer>();// the arraylist to store the result
	    String[] graycode=grayCode1(n);// the string array to store the binary strings.
	    for(int i=0;i<graycode.length;i++){
	    	ret.add(Integer.parseInt(graycode[i],2));// convert binary string to int
	    }
	    return ret;

	}

	public String[] grayCode1(int n){
		// produce 2^n grade codes  
	    String[] graycode = new String[(int) Math.pow(2, n)]; // the arraylist to store the result, the # of graycodes of n bits is 2^n.
	    if (n == 1) {  
	        graycode[0] = "0";  
	        graycode[1] = "1";  
	        return graycode;  
	    }  
	  
	    String[] last = grayCode1(n - 1);  
	  // recursively get the result based on the gray code that with n-1 bits.
	    for (int i = 0; i < last.length; i++) {  
	        graycode[i] = "0" + last[i];  
	        graycode[graycode.length - 1 - i] = "1" + last[i];  
	        
	    } 
	    
	    return graycode;
	}    
	public static void main(String args[]){
		Solution test =new Solution();
		List<Integer> result= new ArrayList<Integer>();
		result=test.grayCode(Integer.parseInt(args[0]));
		for(int i=0;i<result.size();i++){
			System.out.println(result.get(i));
		}
	}
}
