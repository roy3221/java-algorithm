package backtracking;

import java.util.ArrayList;
import java.util.List;

public class Combination_Sum_III {
	public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        getComb(k,n,1,res, new ArrayList<Integer>());
        return res;
    }
    
    private void getComb(int k, int n, int start, List<List<Integer>> res, List<Integer> comb) {
        // System.out.println("n= "+n+"k= "+k);
        // System.out.println(comb);
        if(n == 0 && k == 0) {
            res.add(new ArrayList<Integer>(comb));
            return;
        } else if(n < 0 || k <= 0)   return;
        else{
            for(int i = start; i <= n && i <= 9; i++) {
                comb.add(i);
                k--;
                getComb(k,n-i,i+1,res,comb);
                comb.remove(comb.size()-1);
                k++;
            }  
        }
    }

}
