package anagram;

import java.util.Arrays;

public class anagram {
	public boolean isAnagram(String s, String t) {
        char [] p= new char[s.length()];
        char [] q= new char[t.length()];
        if(s.length()==0&&t.length()==0) return true;
        if(s.length()==1&&t.length()==1){
            if(s.charAt(0)==t.charAt(0)) return true;
        }
        if(s.length()>1&&t.length()>1&&s.length()==t.length()){ 
             for(int i=0;i<s.length();i++){
                p[i]=s.charAt(i);
                q[i]=t.charAt(i);
                }
        Arrays.sort(p);
        Arrays.sort(q);
       if(Arrays.equals(p, q)) return true;
        }
     return false; 
}
	public static void main(String args[]){
		String t1="ab";
		String t2="ba";
		anagram test=new anagram();
		System.out.println(test.isAnagram(t1, t2));
		for(int i=0;i<2;i++){
			System.out.println(test.isAnagram(t1, t2));
		}
		
	}
}
