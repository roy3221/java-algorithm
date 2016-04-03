package backtracking;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
	
	public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> combs = new ArrayList<List<Integer>>();
        combine(combs, new ArrayList<Integer>(), 1, n, k);
        return combs;
    }
    
    public static void combine(List<List<Integer>> combs, List<Integer> comb, int start, int n, int k) {
// System.out.println("k= "+k);
        if(k==0) {
            combs.add(new ArrayList<Integer>(comb));
            return;
        }else{
            for(int i=start;i<=n;i++) {
                comb.add(i);
                
            // System.out.println(comb);
                combine(combs, comb, i+1, n, --k);
                comb.remove(comb.size()-1);
                k++;
            } 
        }
        
    }
}
